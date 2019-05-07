package com.micheal.beanFactoryPostProcessor.importSelector;

import com.micheal.dao.IndexDao;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDao.class.getName()};
	}
}
