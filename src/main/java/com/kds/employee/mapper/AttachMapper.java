package com.kds.employee.mapper;

import com.kds.employee.domain.AttachImageVO;

public interface AttachMapper {
	public int insertImageInfo(AttachImageVO attachImageVO);
	public void deleteWithFile(long itemId);
	public int update(AttachImageVO attachImageVO);
}