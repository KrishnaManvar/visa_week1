package com.visa.prj.dao;

import com.visa.prj.entity.Mobile;

public class MobileDaoMongoImpl implements MobileDao {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("added into mongodb");
	}

	@Override
	public Mobile getMobile(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
