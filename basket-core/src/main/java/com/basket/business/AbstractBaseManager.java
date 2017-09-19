package com.basket.business;

import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by yf on 2017/3/29.
 */
public interface AbstractBaseManager<T, E, K> {

    /**
     * 统计满足条件的记录数。
     * @param e 查询条件
     */
    long countByExample(E e);

    /**
     * 根据条件删除记录。
     * @param e 查询条件
     */
    int deleteByExample(E e);

    /**
     * 根据主键删除记录。
     * @param k 主键
     */
    int deleteByPrimaryKey(K k);

    /**
     * 插入新记录，所有字段都入库。
     * @param t 待插入数据库的对象
     */
    int insert(T t);

    /**
     * 插入新记录，值不为<code>null</code>的字段才入库。
     * @param t 数据库记录对象
     */
    int insertSelective(T t);

    /**
     * 查询符合条件的记录，包括<code>BLOB</code>类型的字段，可实现分页。
     * @param e 查询条件
     * @param rowBounds 记录偏移
     */
    List<T> selectByExampleWithBLOBsWithRowbounds(E e, RowBounds rowBounds);

    /**
     * 查询符合条件的记录，包括<code>BLOB</code>类型的字段。
     * @param e 查询条件
     */
    List<T> selectByExampleWithBLOBs(E e);

    /**
     * 查询符合条件的记录，不包括<code>BLOB</code>类型的字段，可实现分页。
     * @param e 查询条件
     * @param rowBounds 记录偏移
     */
    List<T> selectByExampleWithRowbounds(E e, RowBounds rowBounds);

    /**
     * 查询符合条件的记录，不包括<code>BLOB</code>类型的字段。
     * @param e 查询条件
     */
    List<T> selectByExample(E e);

    /**
     * 根据主键查询记录。
     * @param k 主键
     */
    T selectByPrimaryKey(K k);

    /**
     * 根据条件更新记录，值为<code>null</code>的字段不更新。
     * @param t 数据库记录对象
     * @param e 查询条件
     */
    int updateByExampleSelective(T t, E e);

    /**
     * 根据条件更新记录，所有字段都更新，不包括<code>BLOB</code>类型的字段。
     * @param t 数据库记录对象
     * @param e 查询条件
     */
    int updateByExample(T t, E e);

    /**
     * 根据条件更新记录，所有字段都更新，包括<code>BLOB</code>类型的字段。
     * @param t 数据库记录对象
     * @param e 查询条件
     */
    int updateByExampleWithBLOBs(T t, E e);

    /**
     * 根据主键更新记录，值为<code>null</code>的字段不更新。
     * @param t 数据库记录对象
     */
    int updateByPrimaryKeySelective(T t);

    /**
     * 根据主键更新记录，所有字段都更新，不包括<code>BLOB</code>类型的字段。
     * @param t 数据库记录对象
     */
    int updateByPrimaryKey(T t);

    /**
     * 根据主键更新记录，所有字段都更新，包括<code>BLOB</code>类型的字段。
     * @param t 数据库记录对象
     */
    int updateByPrimaryKeyWithBLOBs(T t);



}
