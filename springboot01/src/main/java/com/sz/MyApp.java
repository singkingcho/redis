package com.sz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sz.bean.User;
@SpringBootApplication
public class MyApp{
	
	public static void main(String[] args) {
		// 禁止自动重启，每次重启也很烦哦，当然他需要spring.devetools的配合。
		System.setProperty("spring.devtools.restart.enabled", "false");
		ConfigurableApplicationContext run = SpringApplication.run(MyApp.class, args);
//		MyBean bean = run.getBean(MyBean.class);
		User bean = run.getBean(User.class);
		System.out.println(bean.getMoney());
	}
	
}
