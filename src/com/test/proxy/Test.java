package com.test.proxy;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		SunBingBing sbb = new SunBingBing();
		//经纪人决定让sbb当替身
		Agent agent = new Agent(sbb);   
		//得到一个替身
		FanBingBing fbb = (FanBingBing) Proxy.newProxyInstance(FanBingBing.class.getClassLoader(), new Class[]{FanBingBing.class},agent);
        fbb.jumpFromBuildingTop();
	}

}
