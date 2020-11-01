package ele.me.controller;


import ele.me.domain.Goods;
import ele.me.service.GoodsService;
import ele.me.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @ResponseBody
    @RequestMapping(value = "/listJSON")
    public MessageAndData listJSON(){
        List<Goods> lists = goodsService.selectByExample(null);
        return MessageAndData.success("").add("lists",lists);
    }
}
