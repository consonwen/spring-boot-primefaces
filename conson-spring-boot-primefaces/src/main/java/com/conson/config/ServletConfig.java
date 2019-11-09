package com.conson.config;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;

import com.sun.faces.config.ConfigureListener;

@Configuration
public class ServletConfig implements ServletContextAware {

	@Bean
	public ServletRegistrationBean<FacesServlet> registerMyServlet() {
		ServletRegistrationBean<FacesServlet> servRegBean = new ServletRegistrationBean<FacesServlet>();
		servRegBean.setServlet(new FacesServlet());
		servRegBean.addUrlMappings("*.xhtml", "*.jsf", "/faces/*", "*.faces");
		servRegBean.setName("FacesServlet");
		servRegBean.setLoadOnStartup(1);
		return servRegBean;
	}

	@Bean
	public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener() {
		return new ServletListenerRegistrationBean<ConfigureListener>(new ConfigureListener());
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
		servletContext.setInitParameter("javax.faces.FACELETS_SKIP_COMMENTS", "true");
	}
}