package com.sit.service.inter;

import com.sit.entity.TopicComment;
import com.sit.entity.TopicInfo;
import com.sit.entity.TopicLike;
import com.sit.entity.TopicPicture;

import java.util.List;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/19 0:59
 * 类名: TopicService
 * </pre>
 */

public interface TopicService {
    boolean haveTodayTopic(long readerId);
    int getTopicCount(long readerId);
    List<TopicInfo> getTopics(long readerId);
    TopicInfo getTopicInfo(long topicId);
    List<TopicLike> getTopicLikes(long topicId);
    List<TopicComment> getTopicComments(long topicId);
    List<TopicPicture> getTopicPictures(long topicId);
}
