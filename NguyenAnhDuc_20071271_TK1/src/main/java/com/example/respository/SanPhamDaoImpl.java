package com.example.respository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.example.entity.SanPham;

@Repository
@Transactional
public class SanPhamDaoImpl implements SanPhamDao {
public static final String HASH_KEY ="SanPham";
private final RedisTemplate template;


SanPhamDaoImpl(RedisTemplate template){
	this.template= template;
	
}
@Override
public List<SanPham> findAll() {

	return template.opsForHash().values(HASH_KEY);
}
@Override
public SanPham save(SanPham sanpham) {
	template.opsForHash().put(HASH_KEY, sanpham.getId(), sanpham);
	return sanpham;
}
@Override
public SanPham findSanPhamById(int id) {
	return (SanPham) template.opsForHash().get(HASH_KEY, id);
}
@Override
public String delete(int id) {
	// TODO Auto-generated method stub
	template.opsForHash().delete(HASH_KEY, id);
	return "Da Xoa San Pham !!";
}
}
