package com.example.demo.domain;

import lombok.Data;

@Data
public class Neko {
	public Neko(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;
}
