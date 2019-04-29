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

		// 1、父类的构造方法 --
		// 2、
		// 3、
		//初始化beanfactory 环境
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

		//主要是是注册BeanDefinition(spring中类的描述 类比与java中 的Class类 描述 类)
		// DefaultListableBeanFactory 中有一个 beanDefinitionMap 存储的
		annotationConfigApplicationContext.register(AppConfig.class);


		//
		annotationConfigApplicationContext.refresh();

		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);

		indexDao.query();


	}
}