package com.examples.streamandmultithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsExamples {

	public static void main(String[] args) {
		
		
		
		//Stream - 
		//how to configure - map and filter - intermediate operation 
		//terminal operation - collect, reduce, get, foreach, findfirst, findany
		//tolist
		
		
		List<Integer> numberList = Arrays.asList(1,53,3,4,55,51,32,122);
		
		//List<Integer> numberList2 = new ArrayList<>(Arrays.asList(12,3,4));
		
		
		//stream -> Filter -> forEach
		numberList.stream().filter(x -> {
			 System.out.println(x);
						return (x>50);
						}).forEach(y -> System.out.println("value " + y));
//		o/p - 	1
//				53
//				value 53
//				3
//				4
//				55
//				value 55
//				51
//				value 51
//				32
//				122
//				value 122

		//Advantage of using streams over for loop that we have to write less code and the code
		//is more clean and readable.	
		//stream never claim it will be fast than for loop
		//will be almost equal 
		
		
		//Short circuting 
		
		numberList.stream().filter(x -> {
			 System.out.println(x);
						return (x>50);
						}).findFirst();
	//In this as soon as findFirst() method executes, it stops printing other Integers of the
	  // ArrayList and leads to shortcircuit.				 	 
//						o/p - 1
//							  53
//							  optional[53]
		
//Optional Class is used to handle the Null Pointer Exception.	 
		Optional<Integer> val = numberList.stream().filter(x -> {
			 System.out.println(x);
						return (x>50);
						}).findFirst();
// output using Optional Class.
//		o/p - 1
//		  	  53
		
	
		
		//Example of Null Pointer Exception.
//		public Person getPerson() {
//			return null
//		}
//		After assigning person object as value null, if we try to access person.getId() directly as
//		null, then it will give error.
//		//Person id or age or name 
//		if(Person !=null && Person.id!=null) {
//			Person.id = 12;
//		}
//		
		
		
		//Optional - is kind of class or container which can hold values as such empty, value
		//present // empty
		
		//ifPresent - do something when we have value
		//isPresent = true when we have non empty value // false if empty
				
		// int 
		//Integer
		
		//Ways to create optional object in java 
		//of - if value present - return the value // if value is null - return empty object 
		
		Optional obj = Optional.of("test");
		
		obj.ifPresent(val2 -> System.out.println("do something")); //o/p - "do something"
		
		Optional obj2 = Optional.empty();
		
		if(obj2.isPresent()) {
		System.out.println("val is present");
		}else {
		System.out.println("else val not present");
		}  //o/p - else val not present.
		
		
		
		 
		Optional<Integer> obj5 = Optional.ofNullable(23);
		if(obj5.isPresent()) {
		System.out.println("checked the nullable value");} //o/p - checked the nullable value
		
		if(obj5.isPresent()) {
		System.out.println("checked the nullable value " + obj5.get()); //o/p - checked the nullable value 23
		}
		
		Optional<Integer> obj6 = Optional.ofNullable(23);
		
		if(obj5.isPresent()) {
			System.out.println("checked the nullable value" + obj6.get());
		}
		
		Optional obj3 = Optional.ofNullable(null);
		
		
		 
		
		
		

//		
//		
//		obj.ifPresent(val2 -> System.out.println("do something"));
		
		
		
		//how would you find min and max eleemnt 
		
		//List<Integer> numberList3 = Arrays.asList(1,53,3,4,55,51,32,122);
		//step 1 : configure it 
		
		//for
		
		//numberList3.stream().map(x -> x).distinct().forEach(null);
		
		//comparator 
		
		
		//Arrays.sort(numberList3);
		//Collections.sort(numberList3);
		
		//syout
		
		//yes it is a terminating operator // reduce // count 
		//int max = numberList3.stream().max(Comparator.comparing(Integer::valueOf)).get();
		// here :: is known as method Reference.
		//Example of method Reference
		//List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		//messages.forEach(word -> StringUtils.capitalize(word));
		//messages.forEach(StringUtils::capitalize);
		
		//System.out.println(max);
		
		//comparator - when we have to do sorting of objects first sort on age then sort on first name
		//comparable - only id or name or age
		
		numberList.stream().map((x)->(x)).distinct().forEach(x->System.out.println(x));

	}

}
