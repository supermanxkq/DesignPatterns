package com.designpatterns.factory.multi.impl;

import com.designpatterns.factory.multi.Sender;

/**
 * @ClassName: MailSender
 * @Description: 邮件发送实现
 * @author xukaiqiang
 * @date 2016年5月2日 下午8:30:58
 * @modifier
 * @modify-date 2016年5月2日 下午8:30:58
 * @version 1.0
 */
public class MailSender implements Sender {

	/*
	 * (non-Javadoc)
	 * @Description: 使用邮件进行发送
	 * @author xukaiqiang
	 * @date 2016年5月2日 下午8:37:33
	 * @modifier
	 * @modify-date 2016年5月2日 下午8:37:33
	 * @version 1.0
	 */
	@Override
	public void Send() {
		System.out.println("this is mailsender!");
	}

}
