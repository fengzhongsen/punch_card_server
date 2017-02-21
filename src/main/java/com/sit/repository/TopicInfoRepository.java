package com.sit.repository;

import com.sit.entity.TopicInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/17 22:23
 * 类名: TopicInfoRepository
 * </pre>
 */

public interface TopicInfoRepository extends CrudRepository<TopicInfo, Long> {
    List<TopicInfo> findByReaderIdAndCreateTimeAfter(long readerId, Date createTime);
    int countByReaderId(long readerId);
}
