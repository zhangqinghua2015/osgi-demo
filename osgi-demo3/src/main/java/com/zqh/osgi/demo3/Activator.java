package com.zqh.osgi.demo3;

import com.zqh.osgi.demo1.ICalculation;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @discription:
 * @date: 2019/08/26 21:14
 */
public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        synchronized (this){
            context.addServiceListener(new DemoServiceListener(context),"(&(objectClass=" + ICalculation.class.getName() + ")(ServiceName=Calculation))");
        }
    }

    @Override
    public void stop(BundleContext context) throws Exception {

    }

}
