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
 * 时间：2017/2/17 21:38
 * 类名: GroupInfo
 * </pre>
 */
@Entity
@Data
public class GroupInfo {
    /**
     * 小组id
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 小组名称
     */
    private String groupName;

    /**
     * 基础天数
     */
    private Integer baseNumber;

    /**
     * 小组等级
     */
    private Byte grade;

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
