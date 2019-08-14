package com.zt.common.service;

import java.util.List;

import com.zt.common.po.Province;

public interface ProvinceService {
	public boolean addProvince(Province province);
	public boolean updateProvince(Province province);
	public boolean delProvince(int provinceId);
	public Province getProvinceById(int provinceId);
	public List<Province> findAll();
}
