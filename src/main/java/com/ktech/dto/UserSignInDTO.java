package com.ktech.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@NotBlank
@AllArgsConstructor
@Data
public class UserSignInDTO {

	@NotBlank(message = "Email is required")
	@Email(message = "Please enter valid email")
	private String email;

	@NotBlank(message = "Password is required")
	@Email(message = "Please enter valid password")
	private String password;
}
