package com.micheal.comfig;

import com.micheal.beanFactoryPostProcessor.importSelector.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wangting
 * @version 1.0
 * @ClassName: AppConfig
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019/4/24 0024 下午 12:52
 */
@Configuration
@ComponentScan("com.micheal")
@Import(MyImportSelector.class)
public class AppConfig {
}
