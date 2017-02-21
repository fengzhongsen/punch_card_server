package com.sit.dto;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/19 1:12
 * 类名: Contact
 * </pre>
 */
@Data
public class Contact {
    private List<Reader> groupMembers; //组成员
    private List<Reader> follows; //关注的人
}
