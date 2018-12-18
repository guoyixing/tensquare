package com.tensquare.spit.dao;

import com.tensquare.spit.pojo.Spit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @date 2018-12-14 11:34
 * @since 1.0.0
 */
public interface SpitDao extends MongoRepository<Spit, String> {
    Page<Spit> findByParentid(String parentid, Pageable pageable);
}
