package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.SanPham;
import com.example.service.SanPhamService;

@RestController
@RequestMapping("/sanpham")
public class SanPhamController {
@Autowired
private SanPhamService dao;

@PostMapping("/save")
public SanPham save(@RequestBody SanPham sanpham) {
	return dao.save(sanpham);
	
}

@GetMapping("/findAll")
public List<SanPham> getAllSanPham(){
	return dao.findAll();
}

@GetMapping("findSanPhamById/{id}")
	public SanPham findSanPham(@PathVariable int id) {
		return dao.findSanPhamById(id);
	
}
@DeleteMapping("delete/{id}")
 public String remove(@PathVariable int id ) {
	return dao.delete(id);
}
}
