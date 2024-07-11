package com.kds.employee.service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kds.employee.common.domain.Criteria;
import com.kds.employee.common.domain.PageDTO;
import com.kds.employee.domain.MemberVO;
import com.kds.employee.mapper.EployeeMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements BaseServiceDefault<MemberVO>{
    
	private final EployeeMapper mapper;

	@Override
	public void register(MemberVO memberVO) {
		LocalDateTime now = LocalDateTime.now();
		Date date = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
		memberVO.setRegDate(date);
		mapper.insert(memberVO);
		
	}

	@Override
	public MemberVO get(Long memberId) {
		return mapper.read(memberId);
	}

	@Override
	public boolean modify(MemberVO memberVO) {
		return mapper.update(memberVO)==1;
	}

	@Override
	public boolean remove(Long memberId) {
		return mapper.delete(memberId)==1;
	}

	@Override
	public List<MemberVO> getList(Criteria cri) {
		System.out.println(cri);
		return mapper.getListWithPaging(cri);
	}
	
	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotalCount(cri);
	}
	
	@Override
    public PageDTO getPageMaker(Criteria cri) {
        int total = getTotal(cri);
        log.info("Creating PageDTO for criteria: " + cri + ", total: " + total);
        return new PageDTO(cri, total);
    }
	
	public MemberVO getByStringId(String memberId) {
		return mapper.readByStringId(memberId);
	}
	
	public boolean removeByStringId(String memberId) {
		return mapper.deleteByStringId(memberId)==1;
	}
	
	public boolean modifyWithdrawal(MemberVO memberVO) {
		int result = mapper.updateWithdrawal(memberVO);
		return result==1;
	}
	
}
