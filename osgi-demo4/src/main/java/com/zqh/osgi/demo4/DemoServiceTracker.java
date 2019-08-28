package com.zqh.osgi.demo4;

import com.zqh.osgi.demo1.ICalculation;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

/**
 * @discription:
 * @date: 2019/08/26 21:21
 */
public class DemoServiceTracker extends ServiceTracker {

    private BundleContext context;

    public DemoServiceTracker(BundleContext ctx) {
        super(ctx, ICalculation.class.getName(), null);
        context = ctx;
    }

    @Override
    public Object addingService(ServiceReference reference) {
        if (reference != null) {
            ICalculation service = (ICalculation) context.getService(reference);
            if (service != null) {
                System.out.println();
                System.out.print("DemoServiceTracker call: ");
                service.say();
            }
        }
        return super.addingService(reference);
    }

    @Override
    public void removedService(ServiceReference reference, Object service) {
        System.out.println("DemoServiceTracker [" + ICalculation.class.getName() + "]服务注销");
        super.removedService(reference, service);
    }
}
