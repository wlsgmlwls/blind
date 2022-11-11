package com.jsframe.blind.repository;

import com.jsframe.blind.entity.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long>{
}
