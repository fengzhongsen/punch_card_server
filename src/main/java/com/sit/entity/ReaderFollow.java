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
 * 时间：2017/2/17 21:43
 * 类名: ReaderFollow
 * </pre>
 */
@Entity
@Data
public class ReaderFollow {
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
     * 被关注者id
     */
    private Long followedId;

    /**
     * 是否有效 true:是 false:否
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
