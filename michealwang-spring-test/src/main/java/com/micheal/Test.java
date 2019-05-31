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

		// 1、父类的构造方法 -- 创建环境
		// 2、创建AnnotatedBeanDefinitionReader(简称BDR) 并委托完成下面逻辑AnnotationConfigUtils.registerAnnotationConfigProcessors
		// 		2.1 设置 DependencyComparator  AutowireCandidateResolver
		// 		2.2 设置6大RootBeanDefinition对象 并注册到BeanDefinitionMap 中
		// 3、创建 ClassPathBeanDefinitionScanner
		//初始化beanfactory 环境
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

		//主要是是注册BeanDefinition(spring中类的描述 类比与java中 的Class类 描述 类)
		// DefaultListableBeanFactory 中有一个 beanDefinitionMap 存储的
		// 这个方法就是 根据一个Class 向容器中 注册一个bd
		annotationConfigApplicationContext.register(AppConfig.class);
//		annotationConfigApplicationContext.addBeanFactoryPostProcessor( new MyBeanFactoryPostProcessor());


		// 这一步才是 最核心的代码
		annotationConfigApplicationContext.refresh();

		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
		IndexDao indexDao1 = annotationConfigApplicationContext.getBean(IndexDao.class);

		indexDao.query();
		System.out.println(indexDao.hashCode()+"---"+indexDao1.hashCode());

	}
}
