package ele.me.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import ele.me.domain.Business;
import ele.me.domain.BusinessCondition;
import ele.me.domain.BusinessExample;
import ele.me.service.BusinessService;
import ele.me.utils.FileUploadUtil;
import ele.me.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping(value = "/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    //  跳转用户管理页面
    @RequestMapping(value = "/businesspage",method = {RequestMethod.GET})
    public String toLogin(){
        return "business";
    }

    @ResponseBody
    @RequestMapping(value = "/listJSON")
    public MessageAndData listJSON(){
        List<Business> lists = businessService.selectByExample(null);
        return MessageAndData.success("").add("lists",lists);
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public MessageAndData list(
            BusinessCondition condition,/*检索条件*/
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize
    ) throws ParseException {

        BusinessExample example = new BusinessExample();
        BusinessExample.Criteria criteria = example.createCriteria();

        String name = "";
        if (condition.getBname() != null && !condition.getBname().equals("")) {
            name = "%" + condition.getBname() + "%";
            criteria.andBnameLike(name);
        }


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = dateFormat.parse("1970-01-01");
        Date endDate = dateFormat.parse("2999-12-31");

        startDate = condition.getStartDate() == null ? startDate : condition.getStartDate();
        endDate = condition.getEndDate() == null ? endDate : condition.getEndDate();
        if (startDate.after(endDate)) {
            Date tempDate = startDate;
            startDate = endDate;
            endDate = tempDate;
        }

        criteria.andAddTimeBetween(startDate, endDate);

        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<Business> lists = businessService.selectByExample(example);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(lists, 8);
        return MessageAndData.success("").add("pageInfo", pageInfo);
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{id}", method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("id") Integer id) {
        Business obj = businessService.selectByPrimaryKey(id);
        return MessageAndData.success("查询成功").add("obj", obj);
    }


    @ResponseBody
    @RequestMapping(value = "/opt", method = RequestMethod.POST)
    public MessageAndData optInsert(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request, Business obj) throws IOException {
        //如果没有新的上传文件则不触发上传操作和改名操作
        if (!file.isEmpty()) {
            String up = FileUploadUtil.up(file);
            obj.setBimg(up);
        }

        Integer i = businessService.insertSelective(obj);
        if (i > 0) {
            return MessageAndData.success("成功添加" + i + "条记录");
        } else {
            return MessageAndData.error("添加失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{ids}", method = RequestMethod.DELETE)
    public MessageAndData deletes(@PathVariable("ids") String ids) {
        //获取传递过来的uid列表,分解为一个集合对象
        List<Integer> iIds = new ArrayList<Integer>();
        String splitSymbol = "\\D";
        String[] sIds = ids.split(splitSymbol);
        Integer i = null;
        for (String sId : sIds) {
            iIds.add(Integer.parseInt(sId));
        }
        if (iIds.size() > 1) {//删除多条记录
            BusinessExample example = new BusinessExample();
            example.createCriteria().andBidIn(iIds);
            i = businessService.deleteByExample(example);
        } else {//删除一条记录
            i = businessService.deleteByPrimaryKey(iIds.get(0));
        }
        return MessageAndData.success("删除成功" + i + "条记录").add("num", i);
    }

    @ResponseBody
    @RequestMapping(value = "/opt", method = RequestMethod.PUT, headers = "content-type=multipart/form-data")
    public MessageAndData optUpdateRest(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request, Business obj) throws IOException {
        //如果没有新的上传文件则不触发上传操作和改名操作
        if (!file.isEmpty()) {
            String up = FileUploadUtil.up(file);
            obj.setBimg(up);
        }
        //如果涉及到复选框的操作,特别是前台如果通过复选框设置单一字段的状态,需要处理,否则出现能设置上不能取消
        //原因是使用了框架的自动封装功能,如果没有选中则封装为null,example判断如果为null则不会添加到更新字段中
//        if (obj.getBstatus() == null) {
//            obj.setBstatus(false);
//        }

        int i = businessService.updateByPrimaryKeySelective(obj);
        if (i > 0) {
            return MessageAndData.success("成功修改" + i + "条记录");
        } else {
            return MessageAndData.error("修改失败");
        }
    }
}
