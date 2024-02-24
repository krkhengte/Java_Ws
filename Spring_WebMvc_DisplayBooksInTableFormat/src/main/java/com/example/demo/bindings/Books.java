package com.example.demo.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {

	private Integer bookId;
	private String bookName;
	private Double bookPrice;
}
