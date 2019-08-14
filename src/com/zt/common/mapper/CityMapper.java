package com.zt.common.mapper;

import java.util.List;

import com.zt.common.po.City;

public interface CityMapper {
	public int addCity(City city);
	public int updateCity(City city);
	public int delCity(int cityId);
	public City getCityById(int cityId);
	public List<City> findCityByProvince(int provinceId);
}
