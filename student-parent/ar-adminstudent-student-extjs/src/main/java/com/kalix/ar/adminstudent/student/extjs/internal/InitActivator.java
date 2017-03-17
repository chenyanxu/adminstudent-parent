package com.kalix.ar.adminstudent.student.extjs.internal;

import com.kalix.framework.core.api.osgi.KalixBundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;

/**
 * Created by sunlf on 14-3-23.
 */
//public class InitActivator implements BundleActivator {
public class InitActivator extends KalixBundleActivator {
    private ServiceReference reference;
    private HttpService httpService;


    @Override
    public void start(BundleContext bundleContext) throws Exception {
        super.start(bundleContext);

        reference = bundleContext.getServiceReference(HttpService.class.getName());
        httpService = (HttpService) bundleContext.getService(reference);

        if(deploy){
            httpService.registerResources(contextPath + "/app/adminstudent/student", "/min/student", null);
            //httpService.registerResources(contextPath + "/adminstudent/resources/images", "/min/resources/images", null);
        }
        else
        {
            httpService.registerResources(contextPath + "/app/adminstudent/student", "/student", null);
            //httpService.registerResources(contextPath + "/adminstudent/resources/images", "/resources/images", null);
        }
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        super.stop(bundleContext);

        if (reference != null)
            bundleContext.ungetService(reference);
        if (httpService != null) {
            httpService.unregister(contextPath + "/app/adminstudent/student");
        }
    }
}
