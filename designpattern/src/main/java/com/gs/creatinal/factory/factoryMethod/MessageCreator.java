package com.gs.creatinal.factory.factoryMethod;

import com.gs.creatinal.factory.factoryMethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage(){
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg ;
    }

    //factory method
    protected abstract Message createMessage();
	
}
