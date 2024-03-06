package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.SanPham;
import com.example.respository.SanPhamDao;

@Service
@Transactional
public class SanPhamServiceImpl implements SanPhamService {

	@Autowired
	private SanPhamDao dao;

	@Override
	public List<SanPham> findAll() {
		return dao.findAll();
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public SanPham save(SanPham sanpham) {
		// TODO Auto-generated method stub
		return dao.save(sanpham);
	}

	@Override
	public SanPham findSanPhamById(int id) {
		// TODO Auto-generated method stub
		return dao.findSanPhamById(id);
	}

}