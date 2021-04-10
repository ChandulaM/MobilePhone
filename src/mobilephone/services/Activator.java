package mobilephone.services;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	
	ServiceRegistration serviceRegistration;

	public void start(BundleContext bundleContext) throws Exception {

		System.out.println("Mobile phone has started up...");
		MessageService msgService = new MessageServiceImpl();
		serviceRegistration = bundleContext.registerService(MessageService.class.getName(),
				msgService, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Mobile phone is turning off...");
		serviceRegistration.unregister();
		
	}

}
