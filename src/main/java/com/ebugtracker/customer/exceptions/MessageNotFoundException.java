package com.ebugtracker.customer.exceptions;

public class MessageNotFoundException extends RuntimeException {
	public MessageNotFoundException(String msg){
        super(msg);
    }

}
