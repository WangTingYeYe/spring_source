package com.micheal;

import com.micheal.comfig.AppConfig;
import com.micheal.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangting
 * @version 1.0
 * @ClassName: wang
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019/4/24 0024 下午 12:49
 */
public class Test {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(AppConfig.class);


		annotationConfigApplicationContext.refresh();

		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);

		indexDao.query();


	}
}
