package com.zt.common.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zt.common.mapper.ProvinceMapper;
import com.zt.common.po.Province;
import com.zt.common.service.ProvinceService;
@Service
@Transactional(propagation=Propagation.NOT_SUPPORTED)
public class ProvinceServiceImpl implements ProvinceService{
	@Resource
	private ProvinceMapper provinceMapper;

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean addProvince(Province province) {
		int rows=provinceMapper.addProvince(province);
		if (rows==1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateProvince(Province province) {
				int rows=provinceMapper.updateProvince(province);
				if (rows==1) {
					return true;
				}else {
					return false;
				}
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean delProvince(int provinceId) {
				int rows=provinceMapper.delProvince(provinceId);
				if (rows==1) {
					return true;
				}else {
					return false;
				}
	}

	@Override
	public Province getProvinceById(int provinceId) {
		return provinceMapper.getProvinceById(provinceId);
	}

	@Override
	public List<Province> findAll() {
		return provinceMapper.findAll();
	}
	
}
