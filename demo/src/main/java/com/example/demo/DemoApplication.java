package com.example.demo;

import com.example.demo.Repository.PersonRepository;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.beans.BookControoler;
import com.example.demo.beans.BookService;
import com.example.demo.constants.Constants;
import com.example.demo.customException.InvalidAgeException;
import com.example.demo.entity.Passport;
import com.example.demo.entity.Person;
import com.example.demo.entity.Product;
import com.example.demo.entity.composteKey.AccountPK;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {
	//@Value()

	public static void main(String[] args) throws Exception {

		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
//		BookControoler bean = run.getBean(BookControoler.class);
//		bean.print();

//		Class<?> bookController = Class.forName("com.example.demo.beans.BookControoler");
//		Field bookService1 = bookController.getField("BookService");
//		bookService1.setAccessible(true);
//		Object o = bookController.newInstance();
//
//		bookService1.set(o,new BookService());
//		List<Integer> list = new ArrayList<>(List.of(26, 2530, 28, 4, 5, 8, 10, 15, 16,16));
//		//Collections.sort(list);
//		List<Map.Entry<Integer, Long>> collect = list.stream().
//				collect(Collectors.groupingBy(n -> n, Collectors.counting())).
//				entrySet().stream().
//				filter(e -> e.getValue() > 1)
//				.collect(Collectors.toList());0
//		System.out.println(collect);
//		int age=17;
//		if(age>=18) {
//			ProductRepository bean = run.getBean(ProductRepository.class);
//			AccountPK accountPK = new AccountPK();
//			accountPK.setAccountID(123456681l);
//
//			accountPK.setAccountType(Constants.Day.Saving);
//			accountPK.setAccId(1);
//			Product product = new Product();
//			product.setProductName("Mouse");
//			product.setProductPrice(20000.0);
//			product.setAccountPK(accountPK);
//			bean.save(product);
//		}else
//			throw new InvalidAgeException();
//	}

//		PersonRepository bean = run.getBean(PersonRepository.class);
//		Person person=new Person();
//		person.setPersonName("Aniket");
//		person.setGender("Male");
//		Passport passport= Passport.builder().passportNumber("jbnjbzcjdhb").issueDate(LocalDate.now()).expDate(LocalDate.of(2028, 7, 4)).build();
//		person.setPassport(passport);
//		passport.setPerson(person);
//		bean.save(person);
//		Optional<Person> byId = bean.findById(1);
//		byId.ifPresent(e-> System.out.println(e));

	}

}
