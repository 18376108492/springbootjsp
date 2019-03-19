package com.itdan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JspController {

    private  final Logger logger=LoggerFactory.getLogger("log4j.properties");

    @RequestMapping("/index")
    public  String index(){
        logger.info("log4j整合成功");
    return "index";
    }

    //模拟界面出错
    @RequestMapping("/myerror")
    public String error(){

            int a=1/0;
        return "index";
    }

}
