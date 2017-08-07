package com.test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		//加载类
		Class c = Class.forName("java.lang.String");
		//得到所有的属性
		Field[] fields = c.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		} 
		System.out.println("============");
		//得到所有的方法
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		} 

	}

}
