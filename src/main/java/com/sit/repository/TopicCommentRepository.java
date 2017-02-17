package com.sit.repository;

import com.sit.entity.TopicComment;
import org.springframework.data.repository.CrudRepository;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/17 22:41
 * 类名: TopicCommentRepository
 * </pre>
 */

public interface TopicCommentRepository extends CrudRepository<TopicComment, Long> {
}
