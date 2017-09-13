package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class RateController {

	@Value("${rate}")
	String rate;	
	
	@Value("${lanecount}")
	String lanecount;

	@Value("${tollstart}")
	String tollstart;
	
	@RequestMapping("/rate")
	public String getRate() {
		return "rate"+rate+"lanecount"+lanecount+"tollstart"+tollstart;
	}


}
