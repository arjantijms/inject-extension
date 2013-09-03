package test;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class StartupBean {
	
	@PostConstruct
	public void onStartup() {
		System.out.println("On startup called");
	}
	
}
