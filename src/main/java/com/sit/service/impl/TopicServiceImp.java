package com.sit.service.impl;

import com.sit.entity.TopicComment;
import com.sit.entity.TopicInfo;
import com.sit.entity.TopicLike;
import com.sit.entity.TopicPicture;
import com.sit.repository.ReaderInfoRepository;
import com.sit.repository.TopicInfoRepository;
import com.sit.service.inter.TopicService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/19 1:22
 * 类名: TopicServiceImp
 * </pre>
 */
@Service
@Log4j
public class TopicServiceImp implements TopicService {
    @Autowired
    TopicInfoRepository topicInfoRepository;
    @Autowired
    ReaderInfoRepository readerInfoRepository;

    @Override
    public boolean haveTodayTopic(long readerId) {
        Date today = new Date();
        List<TopicInfo> topicInfos = topicInfoRepository.findByReaderIdAndCreateTimeAfter(readerId, today);
        if (topicInfos == null || topicInfos.size() == 0) {
            return false;
        }
        return true;
    }

    @Override
    public int getTopicCount(long readerId) {
        return topicInfoRepository.countByReaderId(readerId) + readerInfoRepository.findOne(readerId).getBaseNumber();
    }

    @Override
    public List<TopicInfo> getTopics(long readerId) {
        return null;
    }

    @Override
    public TopicInfo getTopicInfo(long topicId) {
        return null;
    }

    @Override
    public List<TopicLike> getTopicLikes(long topicId) {
        return null;
    }

    @Override
    public List<TopicComment> getTopicComments(long topicId) {
        return null;
    }

    @Override
    public List<TopicPicture> getTopicPictures(long topicId) {
        return null;
    }
}
