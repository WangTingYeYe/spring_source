package com.micheal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author wangting
 * @version 1.0
 * @ClassName: IndexDao
 * Date:     2019/4/24 0024 下午 12:50
 */
@Repository
public class IndexDao {

	@Autowired
	private IndexService indexService;
}
