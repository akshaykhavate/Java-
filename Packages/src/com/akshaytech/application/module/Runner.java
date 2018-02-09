package com.akshaytech.application.module;

import com.akshaytech.application.module.inbox.Email;

public class Runner {
	public static void main(String[] args) {
		Email e1 = new Email();
		Email e2 = new Email();
		com.akshaytech.application.module.sentmail.Email e3 = new com.akshaytech.application.module.sentmail.Email();
		System.out.println(e1.name);
		System.out.println(e2.name);
		System.out.println(e3.name);
	}
}
