package ru.pere.exceptions;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Object> list=new ArrayList<Object>();
		int[] array=new int[5];
		
		for(int i=0;i<5;i++){
			array[i]=i;
		}
		
		for(int i=0;i<5;i++){
			System.out.println(array[i]);
		}
		
		list.add(new Object());
		System.out.println(list.size());
		
		recurse(10);
		

	}

	private static void recurse(int i) {
		recurse(i);
		
	}

}
