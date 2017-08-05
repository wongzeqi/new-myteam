package com.nun.wjq.project.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


public class HttpSessionListener implements HttpSessionAttributeListener {  
  
    public void attributeAdded(HttpSessionBindingEvent arg0) {  
        // TODO Auto-generated method stub  
        System.out.println("HttpSessionAttributeListener--attributeAdded--名:"+arg0.getName()+"--值:"+arg0.getValue());  
    }  
  
    public void attributeRemoved(HttpSessionBindingEvent arg0) {  
        // TODO Auto-generated method stub  
        System.out.println("HttpSessionAttributeListener--attributeRemoved--名:"+arg0.getName()+"--值:"+arg0.getValue());  
    }  
  
    public void attributeReplaced(HttpSessionBindingEvent arg0) {  
        // TODO Auto-generated method stub  
        System.out.println("HttpSessionAttributeListener--attributeReplaced--名:"+arg0.getName()+"--值:"+arg0.getValue());  
    }  
  
}  