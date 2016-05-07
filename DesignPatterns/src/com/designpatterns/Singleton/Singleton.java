package com.designpatterns.Singleton;

/**
 * @ClassName: Singleton
 * @Description: 单例实体
 * @author xukaiqiang
 * @date 2016年5月5日 下午6:59:33
 * @modifier
 * @modify-date 2016年5月5日 下午6:59:33
 * @version 1.0
 */
public class Singleton {
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static Singleton instance = null;

	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}

	/* 静态工程方法，创建实例 */
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
