package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.NekoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class NekoController {
	@Autowired
	private final NekoService service;

	@GetMapping("neko") // helloWorldへのアクセスを制御する
	public String hello(Model model) {
		model.addAttribute("nekoList", service.getNekoList());
		return "neko"; // hello.htmlをクライアントに返す
	}
}