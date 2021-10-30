package com.jincheng.blog.mapper;

import com.jincheng.blog.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


@Mapper
@Repository
public interface UserMapper {

    User userCheck(@PathVariable String username, @PathVariable String password);
}
