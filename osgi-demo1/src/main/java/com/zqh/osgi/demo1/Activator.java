package com.zqh.osgi.demo1;

import com.zqh.osgi.demo1.impl.Calculation;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * @discription:
 * @date: 2019/08/26 20:07
 */
public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        Dictionary<String, String> props = new Hashtable<String, String>();
        props.put("ServiceName", "Calculation");
        context.registerService(ICalculation.class.getName(), new Calculation(), props);
        System.out.println("Calculation Service registered!");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Stop demo1 bundle!");
    }
}
