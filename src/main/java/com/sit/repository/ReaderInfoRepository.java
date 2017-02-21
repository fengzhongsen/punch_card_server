package com.sit.repository;


import com.sit.entity.ReaderInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/17 22:18
 * 类名: ReaderInfoRepository
 * </pre>
 */

public interface ReaderInfoRepository extends CrudRepository<ReaderInfo, Long> {
    List<ReaderInfo> findByGroupId(long groupId);
}
