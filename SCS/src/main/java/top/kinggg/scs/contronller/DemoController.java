package top.kinggg.scs.contronller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import top.kinggg.scs.model.UserDemo;
import top.kinggg.scs.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	DemoService demoService;
	@RequestMapping(value="getUser",method=RequestMethod.GET)
	public UserDemo getUserById(@RequestParam("id") Integer id) {
		return demoService.testDemo(id);
	}
}
