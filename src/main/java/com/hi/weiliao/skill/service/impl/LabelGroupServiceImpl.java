package com.hi.weiliao.skill.service.impl;

import com.hi.weiliao.skill.service.ILabelGroupService;
import com.hi.weiliao.skill.service.ILoveWordService;
import com.hi.weiliao.skill.vo.LabelGroup;
import com.hi.weiliao.skill.vo.LoveWord;
import com.mongodb.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelGroupServiceImpl implements ILabelGroupService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<LabelGroup> query(LabelGroup labelGroup) {
        Criteria criteria = Criteria.where("id").is(labelGroup.getId());
        return mongoTemplate.find(new Query(criteria), LabelGroup.class);
    }

    @Override
    public boolean create(LabelGroup labelGroup) {
        mongoTemplate.save(labelGroup);
        return true;
    }

    @Override
    public boolean update(LabelGroup labelGroup) {
        mongoTemplate.save(labelGroup);
        return true;
    }
}
