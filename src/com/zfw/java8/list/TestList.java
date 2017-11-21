package com.zfw.java8.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestList {

	private List<String> name1;
	private List<Integer> name2;

	@Before
	public void initList() {
		name1 = new ArrayList<String>();
		name1.add("b");
		name1.add("a");
		name1.add("c");

		name2 = new ArrayList<Integer>();
		name2.add(4);
		name2.add(2);
		name2.add(1);
	}

	/**
	 * java7对List内部排序
	 */
	@Test
	public void java7Sort(){
		System.out.println("java7排序前："+name1);
		Collections.sort(name1,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.err.println("java7排序后："+name1);
	}
	
	
	/**
	 * java8对List内部排序
	 */
	@Test
	public void java8Sort(){
		System.out.println("java8排序前："+name2);
		
		Collections.sort(name2,(s1,s2)->s1.compareTo(s2));
		
		System.err.println("java8排序前："+name2);
	}
	
	
	
}
