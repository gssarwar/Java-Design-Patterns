package com.gs.creatinal.factory.factoryMethod;

import com.gs.creatinal.factory.factoryMethod.message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message message = creator.getMessage();
		System.out.println(message);
	}
}
