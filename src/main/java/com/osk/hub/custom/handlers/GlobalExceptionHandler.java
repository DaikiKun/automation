/**
 * @author OAK SOE KHANT	
 *
 */package com.osk.hub.custom.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
 public class GlobalExceptionHandler {
	
     @ExceptionHandler(ResourceNotFoundException.class)
     public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException ex) {
         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
     }
     
     @ExceptionHandler(Exception.class)
     public ResponseEntity<Object> handleResourceNoSuchMethodException(Exception ex) {
    	 ApiError error=new ApiError(null, null	, ex.getMessage());
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
     }
}
