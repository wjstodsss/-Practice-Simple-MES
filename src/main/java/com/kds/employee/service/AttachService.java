package com.kds.employee.service;

import com.kds.employee.domain.AttachImageVO;

public interface AttachService {
	
	public int register(AttachImageVO attachImageVO);
	public boolean remove(long itemId);
	public boolean modify(AttachImageVO attachImageVO);
}
