package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("/")
    public String index(Model model){
        // 加入一个属性，用来在模板中读取
        model.addAttribute("host", "http://blog.didispace.com");

        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    
    
    /**
     * 错误页面 
     * 
     * @return
     */
    @RequestMapping("/exception")
    public String exception(){
        
        throw new RuntimeException("出错啦");
        
    }
}
