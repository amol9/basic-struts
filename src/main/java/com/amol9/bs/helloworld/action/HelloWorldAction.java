package com.amol9.bs.helloworld.action;

import com.amol9.bs.helloworld.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore();
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}