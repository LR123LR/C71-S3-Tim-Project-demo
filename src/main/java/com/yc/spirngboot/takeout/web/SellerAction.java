package com.yc.spirngboot.takeout.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yc.spirngboot.takeout.bean.Seller;
import com.yc.spirngboot.takeout.bean.SellerExample;
import com.yc.spirngboot.takeout.dao.SellerMapper;



@Controller
public class SellerAction {

	@Resource
	 private SellerMapper sm;
	
	@GetMapping("shop_intro")
	public String shop_intro(Model m) {
		SellerExample se= new SellerExample();
		Seller seller =sm.selectByPrimaryKey(1);
		m.addAttribute("seller",seller);
		return "shop_intro";
		
	}
}
