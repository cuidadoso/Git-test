package ru.pere.abq;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	
	private static ArrayBlockingQueue<Object> list=new ArrayBlockingQueue<Object>(1000); 

	public static void main(String[] args) {
		addObject();
		proceed();
	}

	private static void proceed() {
		System.out.println(list.size());
		for(Object element: list){
			list.remove(element);
		}
		System.out.println(list.size());
	}

	private static void addObject() {
		for (int x=0;x<5;x++) {
			list.add(new Object());
			
		}
	}

}
