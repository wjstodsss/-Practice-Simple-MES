package com.kds.employee.service;


import java.util.List;

import com.kds.employee.common.domain.Criteria;
import com.kds.employee.common.domain.PageDTO;



public interface BaseService<T> {
  public T get(Long id);
  
  public List<T> getList(Criteria cri);
  
  public boolean remove(Long id);
  
  public int getTotal(Criteria cri);
  
  public PageDTO getPageMaker(Criteria cri);
}
