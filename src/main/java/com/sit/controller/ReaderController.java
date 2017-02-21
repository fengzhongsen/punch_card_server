package com.sit.controller;

import com.sit.common.model.Response;
import com.sit.common.model.ResponseBuilder;
import com.sit.dto.Contact;
import com.sit.dto.Reader;
import com.sit.entity.ReaderInfo;
import com.sit.service.inter.ReaderService;
import com.sit.service.inter.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/19 1:21
 * 类名: ReaderController
 * </pre>
 */
@RestController
public class ReaderController {
    @Autowired
    ReaderService readerService;
    @Autowired
    TopicService topicService;

    @RequestMapping("/reader")
    Response reader(long id) {
        ReaderInfo readerInfo = readerService.getReaderInfo(id);
        boolean status = topicService.haveTodayTopic(id);
        int punchCount = topicService.getTopicCount(id);
        int popularity = 666666;
        int followMeCount = readerService.getFollowMeCount(id);
        int ranking = 1;

        Reader reader = new Reader();
        reader.setReader(readerInfo);
        reader.setStatus(status);
        reader.setPunchCount(punchCount);
        reader.setPopularity(popularity);
        reader.setFollowMeCount(followMeCount);
        reader.setRanking(ranking);

        return ResponseBuilder.buildSuccess("ok", reader);
    }

    @RequestMapping("/contact")
    Response contact(long id) {
        List<Reader> groupMembers = new ArrayList<>();
        List<ReaderInfo> members = readerService.getGroupMembers(id);
        members.forEach(cr -> {
            Reader reader = new Reader();
            reader.setReader(cr);
            reader.setStatus(topicService.haveTodayTopic(cr.getId()));
            groupMembers.add(reader);
        });

        List<Reader> follows = new ArrayList<>();
        List<ReaderInfo> readerFollows = readerService.getFollows(id);
        readerFollows.forEach(rf->{
            Reader reader = new Reader();
            reader.setReader(rf);
            reader.setStatus(topicService.haveTodayTopic(rf.getId()));
            follows.add(reader);
        });

        Contact contact = new Contact();
        contact.setGroupMembers(groupMembers);
        contact.setFollows(follows);

        return ResponseBuilder.buildSuccess("ok",contact);
    }
}
