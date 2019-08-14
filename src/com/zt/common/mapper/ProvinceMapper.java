package com.zt.common.mapper;

import java.util.List;

import com.zt.common.po.Province;

public interface ProvinceMapper {
	public int addProvince(Province province);
	public int updateProvince(Province province);
	public int delProvince(int provinceId);
	public Province getProvinceById(int provinceId);
	public List<Province> findAll();


}
