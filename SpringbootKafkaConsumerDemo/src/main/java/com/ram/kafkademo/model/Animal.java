package com.ram.kafkademo.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data       // getters, setters, toString, equals, hashCode
@Builder
@NoArgsConstructor   // 👈 Needed for Jackson to deserialize
@AllArgsConstructor
public class Animal
{
	private String name;
	private String color;
	private String animalType;
}