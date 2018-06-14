package com.general.verified.web.controller;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Map;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

	import org.springframework.ui.Model;

	// ������д��ע��Ҫ���springmvc.xml��������ú�index.jsp���������һ�𿴲��������
	@Controller
	public class HelloWorldController {

	    // RequestMapping�е�hello��Ҫ�ͻ�������ʱ��ӳ����ַ��������˵���⣬��ʱ�Ҳ������õ�˵��������helloWorld�������Ǵ����ӳ��
	    @RequestMapping("/hello")
	    public String helloWorld(Model model) {  // ͨ��Model������Խ����ݷ��ظ���̬ҳ��/ǰ��ҳ�棨�ɷ���������
	        String viewArgValue = "Hello World, SpringMVC";
	        model.addAttribute("message", viewArgValue);  // �����message���Ƕ�̬ҳ���еĲ���������hello.jspҳ����${message}�е�message��viewArgValue�ǲ���ֵ
	        // ����WEB-INF/jsp/hello.jsp�ļ����ͻ��ˣ��Ǿ�������˴���ģ�����Ϊ����springmvc.xml��������prefix��suffix������ǰ׺+�߼���ͼ��+��׺�͵õ���Ҫ�����ļ�������·��
	        // ����˳��˵һ��WEB-INF�µ���Դ�ǿͻ����޷�ֱ�ӷ��ʵ���
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
