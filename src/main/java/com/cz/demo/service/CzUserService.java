package com.cz.demo.service;

import com.cz.demo.BaseService;
import com.cz.demo.bean.CzUser;
import com.cz.demo.config.ReadOnly;
import com.cz.demo.mapper.CzUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenzan
 * @version V1.0
 * @description TODO
 * @create-date 2018/7/11
 * @modifier
 * @modifier-data
 */
@Service
public class CzUserService implements BaseService<CzUser> {

    @Resource
    CzUserMapper czUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return czUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CzUser czUser) {
        return czUserMapper.insert(czUser);
    }

    @Override
    public int insertSelective(CzUser czUser) {
        return czUserMapper.insertSelective(czUser);
    }

    @ReadOnly
    @Override
    public CzUser selectByPrimaryKey(Integer id) {
        return czUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CzUser czUser) {
        return czUserMapper.updateByPrimaryKeySelective(czUser);
    }

    @Override
    public int updateByPrimaryKey(CzUser czUser) {
        return czUserMapper.updateByPrimaryKey(czUser);
    }
}
