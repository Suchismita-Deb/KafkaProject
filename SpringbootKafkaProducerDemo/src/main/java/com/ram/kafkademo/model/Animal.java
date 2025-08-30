package com.ram.kafkademo.model;
import lombok.Builder;
import lombok.Data;

@Data       // getters, setters, toString, equals, hashCode
@Builder
public class Animal
{
	private String name;
	private String color;
	private String animalType;
}