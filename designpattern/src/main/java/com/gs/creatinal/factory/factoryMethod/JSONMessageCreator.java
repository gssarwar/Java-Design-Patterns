package com.gs.creatinal.factory.factoryMethod;

import com.gs.creatinal.factory.factoryMethod.message.JSONMessage;
import com.gs.creatinal.factory.factoryMethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
