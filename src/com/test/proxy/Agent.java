package com.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//范冰冰的经纪人(必须实现InvocationHandler接口)，让他来决定谁跳楼
public class Agent implements InvocationHandler{
	//这属性是经纪人产生一个替身的对象
	private Object object;
	public Agent(Object object){
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//产生一个替身对象
		Object obj = method.invoke(object, args);
		System.out.println("iopteri");
		System.out.println("哈哈哈");
		return obj;
	}

}
