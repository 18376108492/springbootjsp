package com.itdan.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局捕获异常类
 * 1.捕获异常后返回JSON格式
 * 2.捕获异常后页面
 */

@RestControllerAdvice //异常处理返回JSON类型
   // @ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> errorReslut(){
        Map<String,Object> map=new HashMap<>();
        map.put("status",500);//错误状态
        map.put("message","系统错误");
        return map;
    }

  //返回错误界面(没测试成功)
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView showError(){
       ModelAndView modelAndView=new ModelAndView("error");
        return modelAndView;
    }

}
