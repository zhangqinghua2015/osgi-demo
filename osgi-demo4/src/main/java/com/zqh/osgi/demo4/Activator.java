package com.zqh.osgi.demo4;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @discription:
 * @date: 2019/08/26 21:14
 */
public class Activator implements BundleActivator {

    DemoServiceTracker tracker;

    @Override
    public void start(BundleContext context) throws Exception {
        try {
            System.out.println("Start demo4 bundle");
            tracker = new DemoServiceTracker(context);
            tracker.open();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Stop demo4 bundle");
        if(tracker != null){
            tracker.close();
        }
    }

}
