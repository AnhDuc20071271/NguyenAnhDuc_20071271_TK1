package com.example.respository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.entity.SanPham;

@Repository
public interface SanPhamDao {
	public  SanPham save(SanPham sanpham);

	public 	List<SanPham> findAll();

	public SanPham findSanPhamById(int id);

	public String delete(int id);
}
