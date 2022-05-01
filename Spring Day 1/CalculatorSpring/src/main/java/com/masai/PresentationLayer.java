package com.masai;

public class PresentationLayer {
	
	ServiceLayer service;
	
	public ServiceLayer getService() {
		return service;
	}

	public void setService(ServiceLayer service) {
		this.service = service;
	}

	public void present() {
		service.getOperation().compute();
	}
}
