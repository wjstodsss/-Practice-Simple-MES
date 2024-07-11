package com.kds.employee.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kds.employee.domain.AttachImageVO;
import com.kds.employee.mapper.AttachMapper;





@Service
public class AttachServiceImpl implements AttachService {
	@Autowired
	private AttachMapper attachMapper;

	@Override
	public int register(AttachImageVO attachImageVO) {
		return attachMapper.insertImageInfo(attachImageVO);
	}

	@Override
	public boolean modify(AttachImageVO attachImageVO) {
		
		if(attachMapper.update(attachImageVO) == 0) {
			register(attachImageVO);
		}
		return true;
	}

	@Override
	public boolean remove(long itemId) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
