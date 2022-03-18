package com.slokam.java.jdp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllermethod {
	
	@GetMapping("wrong")
	public String rascal() {
		
		System.out.println("this is controller method");
		
		return"say that";
	}
@GetMapping("abcd")
	public String[] getdata() {
		String[] Str = 
			{"a","b","c","d"};
		
		return Str;
	}
@GetMapping("result")
public Student getStudentdata() {
	
	Student std = new Student(1,"shiva",4350,990877114);
	return std;
}

@GetMapping("values")
public List<Student>getdata1(){
	
	List<Student> list = new ArrayList<>();
	list = Arrays.asList(
			new Student(1,"shiva",4350,990877114),
			new Student(2,"rp",4351,990877115),
			new Student(3,"prasad",4352,990877116)
			);
	return list;
}
@GetMapping("maping")
 public Map<Integer,String> getmapdata(){
	 
	 Map<Integer,String> map = new HashMap<>();
	 map.put(1, "one");
	 map.put(2, "two");
	 map.put(3, "four");
	 map.put(4, "three");
	 
	 return map;
	 
	 
 }
@GetMapping("StringStudent")
public Map<String,Student>getstudentdata(){
	
	Map<String,Student> map = new HashMap<String, Student>();
	//
	map.put("one",new Student(1,"shiva",4350,990877114));
	map.put("two",new Student(2,"rp",4351,990877115));
	map.put("three",new Student(3,"prasad",4352,990877116));
	
	return map;
}

	
}
