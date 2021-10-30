package com.jincheng.blog.mapper;

import com.jincheng.blog.po.Blog;
import com.jincheng.blog.vo.BlogQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface IndexMapper {

    Blog getBlogByID(Long id);

    //查出所有博客
    List<Blog> listBlog(BlogQuery blog);

    //查出所有博客
    List<Blog> listBlogOnFront(Blog blog);


}
