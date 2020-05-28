package com.cmayorga.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

/* @Scope is used when you want to have differents instances of Object
 * in this case BinarySearchImpl, otherwise this component by default
 * was Singleton.
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	private String hi;
	

	@Autowired
	/*
	 * We can use this way loweUperCase or @Qualifier or @Primary to say what
	 * implementation of SortAlgorithm we want to use
	 *                     | 
	 *                     ∇ */
	private SortAlgorithm bubbleSortAlgorithm;
	
	/*
	 * With out Autowired, this is how we was used an interface implementation
	 * and we was received the type of SortAlgorithm from FirstPracticeApplication
	 *                     | 
	 *                     ∇
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) 
	 * { this.sortAlgorithm = sortAlgorithm; }
	 */

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		
		System.out.println(sortedNumbers);

		System.out.println(bubbleSortAlgorithm);

		return 3;
	}

	
	public String getHi() {
		return hi;
	}

	public void setHi(String hi) {
		this.hi = hi;
	}
	
	


}
