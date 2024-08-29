package com.becoder.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProductDto {

    private Integer id;
	
    @NotBlank
	private String name;
	
    @NotEmpty
    @Size(min = 3, max = 10, message = "description min and max size 3-10")
	private String description;
	
    @NotEmpty
    @Pattern(regexp = "^[0-9]*$", message = "invalid price")
	private Double price;
	
	private Integer quantity;
	
	@Email(message = "invalid email")
	private String email;
	
}
