package com.tensquare.search.dao;

import com.tensquare.search.pojo.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @date 2018-12-18 14:23
 * @since 1.0.0
 */
public interface ArticleDao extends ElasticsearchRepository<Article, String> {
    Page<Article> findByTitleOrContentLike(String title, String content, Pageable pageable);

}
