package ele.me.controller;

import ele.me.domain.Business;
import ele.me.service.BusinessService;
import ele.me.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;


@Controller
@RequestMapping(value = "/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @ResponseBody
    @RequestMapping(value = "/listJSON")
    public MessageAndData listJSON(){
        List<Business> lists = businessService.selectByExample(null);
        return MessageAndData.success("").add("lists",lists);
    }
}
