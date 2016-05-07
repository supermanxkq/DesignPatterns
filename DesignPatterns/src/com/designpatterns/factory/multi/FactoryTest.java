package com.designpatterns.factory.multi;

/**
 * @ClassName: FactoryTest
 * @Description: 工厂测试类
 * @author xukaiqiang
 * @date 2016年5月2日 下午8:43:36
 * @modifier
 * @modify-date 2016年5月2日 下午8:43:36
 * @version 1.0
 */
public class FactoryTest {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceSms();
		sender.Send();
	}
}
