package ele.me.controller;


import ele.me.domain.Categorys;
import ele.me.service.CategorysService;
import ele.me.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorys")
public class CategorysController {
    @Autowired
    private CategorysService categorysService;


    @GetMapping(value = "/list")
    public MessageAndData list(){
        List<Categorys> categorys=categorysService.selectByExample(null);
        return MessageAndData.success("").add("categorys",categorys);


    }
}
