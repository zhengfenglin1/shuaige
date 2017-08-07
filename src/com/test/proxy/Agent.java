package com.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//�������ľ�����(����ʵ��InvocationHandler�ӿ�)������������˭��¥
public class Agent implements InvocationHandler{
	//�������Ǿ����˲���һ������Ķ���
	private Object object;
	public Agent(Object object){
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//����һ���������
		Object obj = method.invoke(object, args);
		System.out.println("iopteri");
		System.out.println("������");
		return obj;
	}

}
