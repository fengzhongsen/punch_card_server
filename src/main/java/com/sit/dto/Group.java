package com.sit.dto;

import com.sit.entity.GroupInfo;
import lombok.Data;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/19 1:18
 * 类名: Group
 * </pre>
 */
@Data
public class Group {
    private GroupInfo group;  //基本信息
    private boolean status;  //小猪打卡状态
    private int ranking;  //小组排名
}
