package com.exceptionHandling;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exception {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	 public Map<String,String> handleInvalidDataException(MethodArgumentNotValidException ex)
	 {
		Map<String,String> errorMap =new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error->{errorMap.put(error.getField(), error.getDefaultMessage());
		});
		
    return  errorMap;
	 }
}
