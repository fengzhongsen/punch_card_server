package com.sit.service.impl;

import com.sit.entity.GroupInfo;
import com.sit.entity.ReaderFollow;
import com.sit.entity.ReaderInfo;
import com.sit.repository.GroupInfoRepository;
import com.sit.repository.ReaderFollowRepository;
import com.sit.repository.ReaderInfoRepository;
import com.sit.service.inter.ReaderService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/19 1:21
 * 类名: ReaderServiceImp
 * </pre>
 */
@Service
@Log4j
public class ReaderServiceImp implements ReaderService {
    @Autowired
    ReaderInfoRepository readerInfoRepository;
    @Autowired
    ReaderFollowRepository readerFollowRepository;
    @Autowired
    GroupInfoRepository groupInfoRepository;

    @Override
    public ReaderInfo getReaderInfo(long readerId) {
        return readerInfoRepository.findOne(readerId);
    }

    /**
     * 我的小组信息
     * @param readerId
     * @return
     */
    @Override
    public List<ReaderInfo> getGroupMembers(long readerId) {
        ReaderInfo readerInfo = readerInfoRepository.findOne(readerId);
        long groupId = readerInfo.getGroupId();
        List<ReaderInfo> groupMembers = readerInfoRepository.findByGroupId(groupId);
        return groupMembers;
    }

    /**
     * 我的粉丝信息
     * @param readerId  关注者ID
     * @return
     */
    @Override
    public List<ReaderInfo> getFollows(long readerId) {
        List<ReaderFollow> readerFollows = readerFollowRepository.findByFollowedId(readerId);
        List<Long> readers = readerFollows.stream().map(rf -> rf.getReaderId()).collect(Collectors.toList());
        List<ReaderInfo> follows = (List<ReaderInfo>) readerInfoRepository.findAll(readers);
        return follows;
    }

    /**
     * 我关注的人的信息
     * @param readerId
     * @return
     */
    @Override
    public List<ReaderInfo> getFolloweds(long readerId) {
        List<ReaderFollow> readerFollows = readerFollowRepository.findByReaderId(readerId);
        List<Long> readers = readerFollows.stream().map(rf -> rf.getFollowedId()).collect(Collectors.toList());
        List<ReaderInfo> follows = (List<ReaderInfo>) readerInfoRepository.findAll(readers);
        return follows;
    }

    /**
     * 我的粉丝数
     * @param readerId
     * @return
     */
    @Override
    public int getFollowMeCount(long readerId) {
        return readerFollowRepository.countByFollowedId(readerId);
    }

    /**
     * 我关注的人数
     * @param readerId
     * @return
     */
    @Override
    public int getFollowedsCount(long readerId) {
        return readerFollowRepository.countByReaderId(readerId);
    }

    /**
     * 小组信息
     * @param groupId
     * @return
     */
    @Override
    public GroupInfo getGroupInfo(long groupId) {
        return groupInfoRepository.findOne(groupId);
    }
}
