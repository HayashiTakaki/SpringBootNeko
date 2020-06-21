package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Neko;

@Repository
@Mapper
public interface NekoMapper {

	public Neko getNeko(@Param("id") int id);

	public ArrayList<Neko> getNekoList();

	public boolean insertNeko(Neko neko);

}
