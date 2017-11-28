package com.example.demo.configuration;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean
	public MyFilter myFilter(){
		return new MyFilter();
	}

	@Bean
	public FilterRegistrationBean testFilterRegistration(){
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(myFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("param", "hello");
		registration.setName("myFilter");
		registration.setOrder(1);
		return registration;
	}
	
	public class MyFilter implements Filter{

		@Value("${springboot.test}")
		private String hello;
		
		@Override
		public void destroy() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
				throws IOException, ServletException {
			// TODO Auto-generated method stub
			HttpServletRequest res = (HttpServletRequest) arg0;
			System.out.println(res.getRequestURI());
			System.out.println(this.hello);
			arg2.doFilter(arg0, arg1);
			
		}

		@Override
		public void init(FilterConfig arg0) throws ServletException {
			// TODO Auto-generated method stub
			System.out.println();
			
		}
		
	}
}
