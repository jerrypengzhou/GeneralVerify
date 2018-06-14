package com.general.verified.web.controller;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Map;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

	import org.springframework.ui.Model;

	// 这里我写的注释要结合springmvc.xml里面的配置和index.jsp里面的内容一起看才容易理解
	@Controller
	public class HelloWorldController {

	    // RequestMapping中的hello是要客户端请求时所映射的字符串（个人的理解，暂时找不到更好的说法），而helloWorld函数则是处理该映射
	    @RequestMapping("/hello")
	    public String helloWorld(Model model) {  // 通过Model对象可以将数据返回给动态页面/前端页面（由服务器处理）
	        String viewArgValue = "Hello World, SpringMVC";
	        model.addAttribute("message", viewArgValue);  // 这里的message就是动态页面中的参数名，即hello.jsp页面中${message}中的message，viewArgValue是参数值
	        // 返回WEB-INF/jsp/hello.jsp文件给客户端（是经过服务端处理的），因为我们springmvc.xml里配置了prefix和suffix故这里前缀+逻辑视图名+后缀就得到了要返回文件的完整路径
	        // 这里顺便说一下WEB-INF下的资源是客户端无法直接访问到的
	        return "/hello";
	    }
	    @RequestMapping("/test1")
	    public String testOne(Model model) {
	    	ArrayList<String> al = new ArrayList<String>();
	    	Map<String,String> map = new HashMap<String,String>();
	    	for(int i=0;i<10;i++)
	    	{
	    		al.add(String.valueOf(i));
	    		map.put(String.valueOf(i), String.valueOf(i));
	    	}
	    	model.addAttribute("test1",al);
	    	return "/test1";
	    }
	    public ModelAndView testTwo() {
	    	ModelAndView m = new ModelAndView();
	    	ArrayList<String> al = new ArrayList<String>();
	    	for(int i=0;i<8;i++)
	    	{
	    		al.add(String.valueOf(i));
	    	}
	    	m.addObject("test2",al);
	    	m.setViewName("/test2");
	    	return m;
	    }
	}
