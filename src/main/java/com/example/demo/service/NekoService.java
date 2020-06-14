package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Neko;

@Service
public class NekoService {

	/**
	 * ねこの一覧を取得する
	 * @return　一覧
	 */
	public ArrayList<Neko> getNekoList() {
		ArrayList<Neko> list = new ArrayList<Neko>();
		list.add(new Neko("たま", 3));
		list.add(new Neko("みけ", 1));
		return list;
	}
}
