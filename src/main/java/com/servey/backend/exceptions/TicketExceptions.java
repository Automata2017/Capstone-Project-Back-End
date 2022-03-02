package com.servey.backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) //A message for when tickets or http link are not found
public class TicketExceptions extends RuntimeException{
    public TicketExceptions(String message){
        super(message);
    }
}
