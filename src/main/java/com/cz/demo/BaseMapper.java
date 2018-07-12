package com.cz.demo;

import com.cz.demo.config.ReadOnly;

/**
 * @author chenzan
 * @version V1.0
 * @description TODO
 * @create-date 2018/7/11
 * @modifier
 * @modifier-data
 */
public interface BaseMapper<T> {
    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据
     *
     * @param t
     * @return
     */
    int insert(T t);

    /**
     * 插入数据 只包含非空字段
     *
     * @param t
     * @return
     */
    int insertSelective(T t);

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新 只更新非空字段
     *
     * @param t
     * @return
     */
    int updateByPrimaryKeySelective(T t);

    /**
     * 根据id更新
     *
     * @param t
     * @return
     */
    int updateByPrimaryKey(T t);
}
