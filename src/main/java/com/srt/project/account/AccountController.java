package com.srt.project.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/acc-details")
	public String getAccountDetails() {
		return "Returning Account Details";
	}
}
