package com.subrutin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrutin.service.AuthSerivce;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Program berjalan");
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
//		Author author = (Author) appContext.getBean("author2");
//		System.out.println(author.getId());
//		System.out.println(author.getName());
//
//		Book book = (Book) appContext.getBean("book2");
//		System.out.println(book.getTitle());
//		System.out.println(book.getAuthor().getName());
//		EmailServiceImpl emailService = (EmailServiceImpl) appContext.getBean("emailService");
//		emailService.sendMail("destination@gmail.com", "Your OTP", "Your OTP is 12345");
		AuthSerivce authService = (AuthSerivce) appContext.getBean("authService");
		authService.login("destination@gmail.com");
	}
}
