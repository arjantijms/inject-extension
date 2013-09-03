package test;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ApplicationScoped
public class ApplicationBean {

	@Inject
	private SampleExtension extension;
	
	@Inject
	private BeanManager manager;
	
	public void myMethod() {
		System.out.println("Extension:" + extension + " Manager:" + manager);
	}
	
}
