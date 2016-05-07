package com.designpatterns.abstractfactory;


public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}
}