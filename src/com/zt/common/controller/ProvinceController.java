package com.zt.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zt.common.po.Province;
import com.zt.common.service.ProvinceService;
@Controller
@RequestMapping("/province/")
public class ProvinceController {
	@Autowired
	private ProvinceService provinceService;
	@RequestMapping("save.do")
	public String addProvince(String name){
		Province p=new Province();
		p.setName(name);
		boolean f=provinceService.addProvince(p);
		if (f) {
			return "success";
		}else {
			return "error";
		}
	}
	
	
	
	@RequestMapping("get.do")
	@ResponseBody
	public Province getProvinceById(HttpServletRequest request){
		String idS=request.getParameter("id");
		int id=0;
		if (idS!=null&&!"".equals(idS)) {
			id=Integer.parseInt(idS);
		}
		Province province=provinceService.getProvinceById(id);
		return province;
	}
}
