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
 * 时间：2017/2/17 21:50
 * 类名: TopicLike
 * </pre>
 */
@Entity
@Data
public class TopicLike {
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
     * 点赞者id
     */
    private Long liker;

    /**
     * 是否有效标识 true:是 false:否
     */
    private Boolean validFlag;

    /**
     * 创建时间
     */
    private Date createTime;
}
