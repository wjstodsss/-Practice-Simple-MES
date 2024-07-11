package com.kds.employee.mapper;

import com.kds.employee.domain.MemberVO;

public interface EployeeMapper extends BaseMapper<MemberVO> {
	public MemberVO readByStringId(String id);
	public int deleteByStringId(String id);
	public int updateWithdrawal(MemberVO memberVO);
}

