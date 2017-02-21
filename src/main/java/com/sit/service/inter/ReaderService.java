package com.sit.service.inter;

import com.sit.entity.GroupInfo;
import com.sit.entity.ReaderInfo;

import java.util.List;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/19 0:08
 * 类名: ReaderService
 * </pre>
 */

public interface ReaderService {
    ReaderInfo getReaderInfo(long readerId);  //获取基本信息
    List<ReaderInfo> getGroupMembers(long readerId);  //或许小组成员基本信息
    List<ReaderInfo> getFollows(long readerId);  //获取我关注的人的基本信息
    List<ReaderInfo> getFolloweds(long readerId);  //获取的粉丝的基本信息
    int getFollowMeCount(long readerId);  //获取我的粉丝数量
    int getFollowedsCount(long readerId);  //获取我关注的人数
    GroupInfo getGroupInfo(long groupId);  //获取小组信息
}
