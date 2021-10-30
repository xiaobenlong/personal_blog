package com.jincheng.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface AdminMapper {


    @Select("select count(*) from t_blog")
    Long getBlogsCount();

    @Select("select sum(view) from t_blog")
    Long getViewsSum();

    @Select("select count(*) from t_comment")
    Long getCommentsCount();

}
