package com.idlogix.ModelValidatorFactory;

import org.adempiere.base.IModelValidatorFactory;
import org.compiere.model.ModelValidator;

import com.idlogix.ModelValidator.MyModelValidator;

public class MyModelValidatorFactory implements IModelValidatorFactory{

	@Override
	public ModelValidator newModelValidatorInstance(String className) {
		// TODO Auto-generated method stub
		
		if(className.equalsIgnoreCase("com.idlogix.ModelValidator.MyModelValidator"))
			return new MyModelValidator();
		return null;
	}

}
