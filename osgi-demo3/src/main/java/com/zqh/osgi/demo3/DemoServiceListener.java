package com.zqh.osgi.demo3;

import com.zqh.osgi.demo1.ICalculation;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;

/**
 * @discription:
 * @date: 2019/08/26 21:10
 */
public class DemoServiceListener implements ServiceListener {

    private BundleContext context;

    public DemoServiceListener(BundleContext cntxt) {
        context = cntxt;
    }

    @Override
    public void serviceChanged(ServiceEvent event) {
        if (event.getType() == ServiceEvent.REGISTERED) {
            ServiceReference ref = event.getServiceReference();
            if (ref != null) {
                ICalculation service = (ICalculation) context.getService(ref);
                if (service != null) {
                    System.out.println();
                    System.out.print("DemoServiceListener call: ");
                    service.say();
                }
            }
        } else if (event.getType() == ServiceEvent.UNREGISTERING) {
            System.out.println("[" + ICalculation.class.getName() + "]服务注销");
        }
    }
}