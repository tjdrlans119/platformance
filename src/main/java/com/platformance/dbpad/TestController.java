package com.platformance.dbpad;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {
	
	@RequestMapping("/testapi22")
	public String test(){
		return "TEST";
	}
	
    @RequestMapping(value = "/testapi", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String isRunning() {
        return "I'm Alive!";
    }
    
    @GetMapping("test")
    public String test(@RequestParam(value = "title")String title,@RequestParam(value = "content")String content ) {
        String result = "gigigigigig	igigigigitest입니다";
        System.out.println(title);
        System.out.println(content);
        return result;
    }

}
