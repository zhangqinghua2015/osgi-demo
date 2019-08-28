package com.zqh.osgi.demo2;

import com.zqh.osgi.demo1.ICalculation;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * @discription:
 * @date: 2019/08/26 20:15
 */
public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Start demo2 bundle!");
        ServiceReference[] refs = context.getServiceReferences(ICalculation.class.getName(), "(ServiceName=Calculation)");
        if(refs!=null && refs.length>0){
            ICalculation service=(ICalculation)context.getService(refs[0]);
            service.say();
        }
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Stop demo2 bundle!");
    }
}
