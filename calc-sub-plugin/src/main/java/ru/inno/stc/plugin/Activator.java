package ru.inno.stc.plugin;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import ru.inno.stc.osgi.api.CalculatorService;
import ru.inno.stc.plugin.impl.SubService;

import java.util.Hashtable;

public class Activator implements BundleActivator {

    public static BundleContext bundleContext;

    @Override
    public void start(BundleContext context) {
        bundleContext = context;
        registerServices();
    }

    @Override
    public void stop(BundleContext context) {
        bundleContext = null;
    }

    private void registerServices() {
        CalculatorService service = new SubService();
        bundleContext.registerService(CalculatorService.class.getName(), service, new Hashtable<>());
        System.out.println("Service registered: " + service.name());
    }

}
