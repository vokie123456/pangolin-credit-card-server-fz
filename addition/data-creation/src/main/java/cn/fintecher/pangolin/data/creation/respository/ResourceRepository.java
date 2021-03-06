package cn.fintecher.pangolin.data.creation.respository;

import cn.fintecher.pangolin.entity.managentment.Resource;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;


/**
 * Created by ChenChang on 2018/6/7
 */
public interface ResourceRepository extends MongoRepository<Resource, String>,
        QuerydslPredicateExecutor<Resource> {
}
