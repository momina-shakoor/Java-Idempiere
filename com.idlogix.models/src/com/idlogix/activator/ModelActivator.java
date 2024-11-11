package com.idlogix.activator;

import org.adempiere.base.Core;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ModelActivator implements BundleActivator{

	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		
		Core.getMappedModelFactory().scan(context, "com.idlogix.model");
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
