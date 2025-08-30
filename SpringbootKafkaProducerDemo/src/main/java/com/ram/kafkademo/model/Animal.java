package com.ram.kafkademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
	private Wild wild;
	private Detail detail;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	static class Wild {
		private boolean value;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	static class Detail {
		private String name;
		private String color;
		private String animalType;
	}
}
