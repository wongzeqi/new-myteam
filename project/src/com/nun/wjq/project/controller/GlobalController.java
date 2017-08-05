package com.nun.wjq.project.controller;
import org.springframework.stereotype.Controller;   
import org.springframework.web.bind.annotation.ExceptionHandler;   
import org.springframework.web.bind.annotation.RequestMapping;   

import com.nun.wjq.project.exception.CustomException;
  
  
@Controller  
public class GlobalController {   
  
       
    /**  
     * 用于处理异常的  
     * @return  
     */  
    @ExceptionHandler({CustomException.class})   
    public String exception(CustomException e) {   
        System.out.println(e.getMessage());   
        e.printStackTrace();   
        return "exception";   
    }   
       
    @RequestMapping("test")   
    public void test() throws CustomException {   
        throw new CustomException("出错了！");   
    }   
       
       
}  