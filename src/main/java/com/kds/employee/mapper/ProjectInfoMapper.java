package com.kds.employee.mapper;

import com.kds.employee.domain.ItemVO;

public interface ProjectInfoMapper extends BaseMapper<ItemVO> {
	void updateItemStock(ItemVO itemVO);
	public int updateItemState(ItemVO itemVO);
	public int insertItemState(ItemVO itemVO);
}
