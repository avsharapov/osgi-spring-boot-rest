package ru.inno.stc.osgi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.inno.stc.osgi.controller.rest.ControllerConfig;

@Configuration
@ComponentScan("ru.inno.stc.osgi")
@Import(ControllerConfig.class)
public class CoreConfig {

}
