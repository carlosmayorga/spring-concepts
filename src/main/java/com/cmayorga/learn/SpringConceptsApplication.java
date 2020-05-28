package com.cmayorga.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = context.getBean(BinarySearchImpl.class);
		System.out.println(context.getBean(BinarySearchImpl.class));
	
		binarySearchImpl.setHi("HOLA 1");
		System.out.println(binarySearchImpl.getHi());
		
		
		BinarySearchImpl binarySearchImpl2 = context.getBean(BinarySearchImpl.class);
		System.out.println(context.getBean(BinarySearchImpl.class));
	
		System.out.println(binarySearchImpl2.getHi());
		
		
		/*
		 * Without the famous Spring ComponentScan, this is how we would have made a statement 
		 * to use the BinarySearchImpl, that needs a sort algorithm implementation.
		 *                           |
		 *                           |
		 *                           ∇
		 * BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm());
		 * int result = binarySearchImpl.binarySearch(new int[] {12, 3, 5}, 3);
		 */
		
	}

}
