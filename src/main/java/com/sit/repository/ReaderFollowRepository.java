package com.sit.repository;

import com.sit.entity.ReaderFollow;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/17 22:22
 * 类名: ReaderFollowRepository
 * </pre>
 */

public interface ReaderFollowRepository extends CrudRepository<ReaderFollow, Long> {
    List<ReaderFollow> findByFollowedId(long followedId);
    List<ReaderFollow> findByReaderId(long readerId);
    int countByFollowedId(long followedId);
    int countByReaderId(long readerId);
}
