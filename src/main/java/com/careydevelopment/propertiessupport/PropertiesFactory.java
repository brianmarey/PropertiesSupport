package com.careydevelopment.propertiessupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFactory {

	public static final Properties getProperties(String propertiesFile) throws PropertiesFactoryException {
		Properties properties = new Properties();
		
		try {
			File file = new File(propertiesFile);
			FileInputStream inStream = new FileInputStream(file);
			properties.load(inStream);
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
			throw new PropertiesFactoryException("Can't find file " + propertiesFile);
		} catch (IOException ie) {
			ie.printStackTrace();
			throw new PropertiesFactoryException("Problem reading file " + propertiesFile);
		}
		
		return properties;
	}
}
