package com.visa.prj.dao;

import com.visa.prj.entity.Mobile;

public class MobileDaoDbimpl implements MobileDao {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("added into db");
	}

	@Override
	public Mobile getMobile(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
