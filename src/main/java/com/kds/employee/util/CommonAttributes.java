package com.kds.employee.util;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kds.employee.common.domain.Criteria;

@Component
public class CommonAttributes {
	public void addCommonAttributes(RedirectAttributes rttr, Criteria cri) {
	    rttr.addAttribute("sortType", cri.getSortType());
	    rttr.addAttribute("pageNum", cri.getPageNum());
	    rttr.addAttribute("amount", cri.getAmount());
	}
}
