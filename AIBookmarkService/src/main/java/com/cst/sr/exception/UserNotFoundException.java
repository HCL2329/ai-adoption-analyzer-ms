package com.cst.sr.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String message;

}
