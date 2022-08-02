package com.bootcamp.customer.excepcion;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;
/**
 * Clase para.
 * 
 * @author chuamaca
 *
 */

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomerCreationException extends RuntimeException {

  public CustomerCreationException(String message) {
    super(message);
  }

}
