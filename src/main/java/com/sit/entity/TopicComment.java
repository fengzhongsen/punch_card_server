package com.sit.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/17 21:54
 * 类名: TopicComment
 * </pre>
 */
@Entity
@Data
public class TopicComment {
    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 话题id
     */
    private Long topicId;

    /**
     * 评论者id
     */
    private Long commenter;

    /**
     * 回复者id
     */
    private Long replier;

    /**
     * 创建时间
     */
    private Date createTime;
}
