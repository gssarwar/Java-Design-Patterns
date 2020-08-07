package com.gs.creatinal.factory.factoryMethod;

import com.gs.creatinal.factory.factoryMethod.message.Message;
import com.gs.creatinal.factory.factoryMethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
