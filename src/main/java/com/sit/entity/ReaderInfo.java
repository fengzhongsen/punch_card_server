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
 * 时间：2017/2/17 21:34
 * 类名: ReaderInfo
 * </pre>
 */
@Entity
@Data
public class ReaderInfo {
    /**
     * 读者id
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 微信ID
     */
    private String wxId;

    /**
     * 读者名称
     */
    private String name;

    /**
     * 头像地址
     */
    private String head;

    /**
     * 性别
     */
    private Byte gender;

    /**
     * 电话
     */
    private String tel;

    /**
     * 学校
     */
    private String school;

    /**
     * 学院
     */
    private String department;

    /**
     * 职业
     */
    private Integer career;

    /**
     * 学号
     */
    private String jobId;

    /**
     * 小组id
     */
    private Long groupId;

    /**
     * 基础天数
     */
    private Integer baseNumber;

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
