package com.singtel.ngoft.drools.bre;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

public class BREProperties {
	Logger logger = LoggerFactory.getLogger(BREProperties.class);

	Properties props = loadProperties();

	private Properties loadProperties() {
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String appConfigPath = rootPath + "bre-config.properties";

		Properties appProps = new Properties();
		try {
			appProps.load(new FileInputStream(appConfigPath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return appProps;
	}

	public String getProperties(String key) {
		System.out.println("key ::" + key);
		System.out.println("env.getProperty(key) :" + props.getProperty(key));
		return props.getProperty(key);
	}

}
