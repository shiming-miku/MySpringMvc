package org.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicReference;

@Controller
@RequestMapping("/")
public class WebController {

	@RequestMapping("web")
	public String web(HttpServletRequest request, Model model) {
		// 添加模型数据 可以是任意的POJO对象
		model.addAttribute("message", "Hello World!saber miku 6/28");

//		system.out
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		return "hello";
	}

	// public ModelAndView handleRequest(HttpServletRequest arg0,
	// HttpServletResponse arg1) throws Exception {
	// //1、收集参数、验证参数
	// //2、绑定参数到命令对象
	// //3、将命令对象传入业务对象进行业务处理
	// //4、选择下一个页面
	// ModelAndView mv = new ModelAndView();
	// //添加模型数据 可以是任意的POJO对象
	// mv.addObject("message", "Hello World!saber miku 6/23");
	// //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
	// mv.setViewName("hello");
	// return mv;
	// }

}
