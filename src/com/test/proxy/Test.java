package com.test.proxy;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		SunBingBing sbb = new SunBingBing();
		//�����˾�����sbb������
		Agent agent = new Agent(sbb);   
		//�õ�һ������
		FanBingBing fbb = (FanBingBing) Proxy.newProxyInstance(FanBingBing.class.getClassLoader(), new Class[]{FanBingBing.class},agent);
        fbb.jumpFromBuildingTop();
	}

}
