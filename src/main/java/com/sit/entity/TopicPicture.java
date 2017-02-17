package com.sit.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/17 21:46
 * 类名: TopicPicture
 * </pre>
 */
@Entity
@Data
public class TopicPicture {
    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 动态id
     */
    private Long topicId;

    /**
     * 图片地址
     */
    private Long image;
}
