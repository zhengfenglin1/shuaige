package com.test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		//������
		Class c = Class.forName("java.lang.String");
		//�õ����е�����
		Field[] fields = c.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		} 
		System.out.println("============");
		//�õ����еķ���
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		} 

	}

}
