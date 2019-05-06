package com.micheal.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author wangting
 * @version 1.0
 * @ClassName: MyBeanFactoryPostProcessor
 * Function: beanFactoy后置处理器
 * Date:     2019/5/6 0006 下午 17:53
 */
//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		BeanDefinition indexDao = beanFactory.getBeanDefinition("indexDao");
		indexDao.setScope("prototype");
	}
}
