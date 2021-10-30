package com.jincheng.blog.service;

import com.jincheng.blog.po.Comment;

import java.util.List;


public interface CommentService {


    List<Comment> listComments(Long blogId);

    List<Comment> listAllComments();

    List<Comment> listAdminComments();

    int saveComments(Comment comment);

    int deleteComments(Long id);
}
