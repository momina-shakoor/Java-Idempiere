package com.idlogix.form;

import org.adempiere.webui.panel.ADForm;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Vbox;

public class Form extends ADForm {

    Textbox b = new Textbox();
    Label label = new Label("Enter Text:");

    @Override
    protected void initForm() {
        Vbox container = new Vbox();
        container.setSpacing("10px"); 
        
        
        container.appendChild(label);
        container.appendChild(b);

       
        b.addEventListener(Events.ON_OK, this);

        this.appendChild(container);
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
