package com.wjq.test;  
  
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
  
/** 
 * 基于注解的定时器 
 * @author hj 
 */  
@Component
public class MyTaskAnnotation {  
    
    @Scheduled(cron = "0/5 * * * * ? ") // 间隔5秒执行
    public void taskCycle() {
        System.out.println("使用SpringMVC框架配置定时任务");
    }
   
}  