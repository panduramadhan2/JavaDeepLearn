package com.subrutin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrutin.domain.Author;
import com.subrutin.domain.Book;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		Author author = (Author) appContext.getBean("author");
		System.out.println(author.getId());
		System.out.println(author.getName());
<<<<<<< HEAD

		Book book = (Book) appContext.getBean("book");
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor().getName());
=======
>>>>>>> 796bc4c4c322ebed1355468f2288b24b59fa2aca
	}
}
