package com.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

import com.designpatterns.abstractfactory.MailSender;
import com.designpatterns.abstractfactory.Sender;
import com.designpatterns.abstractfactory.SmsSender;

public class Builder {

	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
