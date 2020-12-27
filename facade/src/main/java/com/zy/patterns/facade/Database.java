package com.zy.patterns.facade;

import java.util.Properties;

public class Database {
    
    private Database() {
        
    }
    
    public static Properties getProperties() {
        Properties prop = new Properties();
        prop.setProperty("name", "Zard");
        prop.setProperty("mailAddress", "Zard2077@xx.com");
        return prop;
    }
    
}
