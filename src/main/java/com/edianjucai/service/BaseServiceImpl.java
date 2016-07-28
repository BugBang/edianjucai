package com.edianjucai.service;

import java.io.Serializable;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edianjucai.service.impl.IBaseService;

@Service
public class BaseServiceImpl<T, PK extends Serializable> implements IBaseService<T, PK> {

    

}
