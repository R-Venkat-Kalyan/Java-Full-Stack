package com.example.sbmicro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	
	@GetMapping("/range")
	public Services method() {
		return new Services(2,10);
	}

}
