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
 * 时间：2017/2/17 21:36
 * 类名: TopicInfo
 * </pre>
 */
@Entity
@Data
public class TopicInfo {
    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 读者id
     */
    private Long readerId;

    /**
     * 内容
     */
    private String content;

    /**
     * 是否有效标识 true:是 false:否
     */
    private Boolean validFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;
}
