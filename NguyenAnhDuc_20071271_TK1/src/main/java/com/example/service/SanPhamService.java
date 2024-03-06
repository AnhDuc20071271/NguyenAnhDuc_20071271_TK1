package com.example.service;

import java.util.List;

import com.example.entity.SanPham;

public interface SanPhamService {

	SanPham save(SanPham sanpham);

	List<SanPham> findAll();

	SanPham findSanPhamById(int id);

	String delete(int id);

}
