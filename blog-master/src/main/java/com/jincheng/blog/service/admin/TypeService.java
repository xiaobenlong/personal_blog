package com.jincheng.blog.service.admin;

import com.jincheng.blog.po.Type;

import java.util.List;

/**
 * @author kuls
 * @Desc kuls
 * @date 2020/5/4 7:30 下午
 */
public interface TypeService {


    int save(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    List<Type> listType();

    int updateType(Type type);

    int deleteType(Long id);


}
