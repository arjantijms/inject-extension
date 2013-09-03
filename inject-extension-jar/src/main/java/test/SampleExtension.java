package test;

import static java.lang.System.out;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;

public class SampleExtension implements Extension {

	public void onBeanDiscovery(@Observes AfterBeanDiscovery beanDiscovery, BeanManager beanManager) {
		out.println("Extension called");
	}

}
