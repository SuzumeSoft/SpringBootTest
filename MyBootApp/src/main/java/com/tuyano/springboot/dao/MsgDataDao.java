package com.tuyano.springboot.dao;

import java.util.List;

public interface MsgDataDao<MsgData> {

	public List<MsgData> getAll();
	public MsgData findById(long id);
}
