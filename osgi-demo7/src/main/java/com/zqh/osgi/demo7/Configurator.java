package com.zqh.osgi.demo7;

import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;

import java.util.Dictionary;
import java.util.Enumeration;

/**
 * @discription:
 * @date: 2019/08/27 19:32
 */
public class Configurator implements ManagedService {

    @Override
    public void updated(Dictionary dictionary) throws ConfigurationException {
        if (dictionary != null) {
            Enumeration enumeration = dictionary.keys();
            while (enumeration.hasMoreElements()) {
                String key = (String) enumeration.nextElement();
                System.out.println(key + " = " + dictionary.get(key));
            }
        }
    }
}
