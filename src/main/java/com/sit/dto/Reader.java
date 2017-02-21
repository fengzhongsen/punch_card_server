package com.sit.dto;

import com.sit.entity.ReaderInfo;
import lombok.Data;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/19 1:17
 * 类名: Reader
 * </pre>
 */
@Data
public class Reader {
    private ReaderInfo reader;  //基本信息
    private boolean status;  //打卡状态
    private int punchCount;  //打卡天数
    private int popularity; //人气指数
    private int followMeCount;  //粉丝数量
    private int ranking;  //好友排名
}
