package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.*;
import com.entity.*;
import com.service.*;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/testUs",produces = {"application/json; charset=UTF-8"})
    @ResponseBody
    public Object testUs() throws Exception{
         String js = "";
         System.out.println("-----testUs");
         List<Users> list = userService.selectAll();

         js = JSON.toJSONString(list);
         System.out.println("-----json = "+js);

         return js;
    }

}
