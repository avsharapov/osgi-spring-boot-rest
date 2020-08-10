package ru.inno.stc.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration
@EnableAutoConfiguration
@Import(CoreConfig.class)
public class Activator implements BundleActivator {

    public static BundleContext bundleContext;
    ConfigurableApplicationContext appContext;

    @Override
    public void start(BundleContext context) {
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
        appContext    = SpringApplication.run(Activator.class);
        bundleContext = context;
    }

    @Override
    public void stop(BundleContext context) {
        bundleContext = null;
        SpringApplication.exit(appContext, () -> 0);
    }

    public static BundleContext getBundleContext() {
        return bundleContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(Activator.class, args);
    }

}
