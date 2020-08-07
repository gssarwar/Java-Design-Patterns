package com.gs.structural.decorator;

import java.util.Base64;

import static java.util.Base64.getEncoder;

public class Base64EncodedMessage implements Message {

	private Message msg;
	
	public Base64EncodedMessage(Message msg) {
		this.msg = msg;
	}

	@Override
	public String getContent() {
		//Be wary of charset!! This is platform dependent..
		return getEncoder().encodeToString(msg.getContent().getBytes());
	}
	
	
}
