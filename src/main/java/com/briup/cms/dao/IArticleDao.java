package com.briup.cms.dao;

import com.briup.cms.bean.Article;
import com.briup.cms.exception.CustomerException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticleDao extends JpaRepository<Article,Integer> {

    Article findById(int id);
}
