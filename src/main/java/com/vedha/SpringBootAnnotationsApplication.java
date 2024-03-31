package com.vedha;

import com.vedha.annotations.repository.RepositoryAnno;
import com.vedha.annotations.autowired.AutowiredAnno;
import com.vedha.annotations.bean.BeanClass;
import com.vedha.annotations.component.ComponentAnno;
import com.vedha.annotations.configuration.ConfigurationAnno;
import com.vedha.annotations.configurationproperties.ConfigurationPropertiesClass;
import com.vedha.annotations.controller.ControllerAnno;
import com.vedha.annotations.lazy.LazyLoaderAnno;
import com.vedha.annotations.primary.PrimaryAnno;
import com.vedha.annotations.propertysource.PropertySourceValue;
import com.vedha.annotations.qualifier.QualifierAnno;
import com.vedha.annotations.scope.PrototypeBeanScopeAnno;
import com.vedha.annotations.scope.SingletonBeanScopeAnno;
import com.vedha.annotations.scope.SpringDefaultScope;
import com.vedha.annotations.service.ServiceAnno;
import com.vedha.annotations.value.ValueAnno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAnnotationsApplication {

	public static void main(String[] args) {

		var appContext = SpringApplication.run(SpringBootAnnotationsApplication.class, args);

		ComponentAnno bean = appContext.getBean(ComponentAnno.class);
		System.out.println(bean.getSampleMethod());

		AutowiredAnno bean1 = appContext.getBean(AutowiredAnno.class);
		System.out.println(bean1.getAutoWiredMethod());

		QualifierAnno bean2 = appContext.getBean(QualifierAnno.class);
		System.out.println(bean2.getQualifier());

		PrimaryAnno bean3 = appContext.getBean(PrimaryAnno.class);
		System.out.println(bean3.getSampleMethod());

		ConfigurationAnno bean4 = appContext.getBean(ConfigurationAnno.class);
		System.out.println(bean4.getSampleMethod());

		BeanClass bean5 = appContext.getBean(BeanClass.class);
		System.out.println(bean5.getSampleMethod());

		ControllerAnno bean6 = appContext.getBean(ControllerAnno.class);
		System.out.println(bean6.getSampleMethod());

		ServiceAnno bean7 = appContext.getBean(ServiceAnno.class);
		System.out.println(bean7.getSampleMethod());

		RepositoryAnno bean8 = appContext.getBean(RepositoryAnno.class);
		System.out.println(bean8.getSampleMethod());

		LazyLoaderAnno bean9 = appContext.getBean(LazyLoaderAnno.class);
		System.out.println(bean9.getSampleMethod());

		System.out.println("Spring Boot --> Scope Annotation");
		SpringDefaultScope bean10 = appContext.getBean(SpringDefaultScope.class);
		System.out.println(bean10.hashCode());

		SpringDefaultScope bean11 = appContext.getBean(SpringDefaultScope.class);
		System.out.println(bean11.hashCode());

		SingletonBeanScopeAnno bean12 = appContext.getBean(SingletonBeanScopeAnno.class);
		System.out.println(bean12.hashCode());

		SingletonBeanScopeAnno bean13 = appContext.getBean(SingletonBeanScopeAnno.class);
		System.out.println(bean13.hashCode());

		SingletonBeanScopeAnno bean14 = appContext.getBean(SingletonBeanScopeAnno.class);
		System.out.println(bean14.hashCode());

		PrototypeBeanScopeAnno bean15 = appContext.getBean(PrototypeBeanScopeAnno.class);
		System.out.println(bean15.hashCode());

		PrototypeBeanScopeAnno bean16 = appContext.getBean(PrototypeBeanScopeAnno.class);
		System.out.println(bean16.hashCode());

		PrototypeBeanScopeAnno bean17 = appContext.getBean(PrototypeBeanScopeAnno.class);
		System.out.println(bean17.hashCode());

		ValueAnno bean18 = appContext.getBean(ValueAnno.class);
		System.out.println(bean18.getDefaultValue());
		System.out.println(bean18.getPropertyValue());
		System.out.println("Spring Boot --> Value Annotation (System Variable)");
		System.out.println(bean18.getSysValue());
		System.out.println("Spring Boot --> Value Annotation (Env Variable)");
		System.out.println(bean18.getEnvValue());

		PropertySourceValue bean19 = appContext.getBean(PropertySourceValue.class);
		System.out.println(bean19.getPropertyValue());
		System.out.println(bean19.getPropertyValue2());

		ConfigurationPropertiesClass bean20 = appContext.getBean(ConfigurationPropertiesClass.class);
		bean20.printProperties();

	}

}
