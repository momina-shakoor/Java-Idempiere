package com.idlogix.formfactory;

import org.adempiere.webui.factory.IFormFactory;
import org.adempiere.webui.panel.ADForm;

import com.idlogix.form.Form;

public class formFactory implements IFormFactory{

	@Override
	public ADForm newFormInstance(String formName) {
		// TODO Auto-generated method stub
		
		if(formName.contains("Form"))
			return new Form();
		
		return null;
	}

}
