package com.idlogix.form;

import org.adempiere.webui.panel.ADForm;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Textbox;

public class Form extends ADForm {

	Textbox b = new Textbox();
	
	@Override
	protected void initForm() {
		// TODO Auto-generated method stub
	b.addEventListener(Events.ON_OK, this);
	this.appendChild(b);
	
	}
	
	@Override
	public void onEvent(Event event) throws Exception {
	    try {
	        if (event.getTarget().equals(b) && event.getName().equals(Events.ON_OK)) {
	            System.out.println("Textbox: " + b.getRawValue());
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
