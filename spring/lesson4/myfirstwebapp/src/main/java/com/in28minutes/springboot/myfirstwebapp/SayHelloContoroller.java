package com.in28minutes.springboot.myfirstwebapp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Controller
public class SayHelloContoroller {
	//"say-hello" => "Hello! What are you learning today?"
	
	@RequestMapping("say-hello")
	@ResponseBody //넣지 않으면 return 된값을 mapping함
	public String SayHello()
	{
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody //넣지 않으면 return 된값을 mapping함
	public String SayHelloHtmlS()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first HTML page</title>");
		sb.append("<head>");
		sb.append("<body>");
		sb.append("<h1> My first HTML page body</h1>");
		sb.append("<body>");
		sb.append("<html>");
		return sb.toString();
	}
	
	//say-hello-jsp =>sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String SayHelloJSP()
	{
		return "sayHello";
	}
}