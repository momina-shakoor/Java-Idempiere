package com.idlogix.form;

import org.adempiere.webui.component.Datebox;
import org.adempiere.webui.panel.ADForm;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Radio;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Vbox;

public class Form extends ADForm {
    
    // Name
    Label Name = new Label("Name:");
    Textbox name = new Textbox();
    
    // Email
    Label Email = new Label("Email:");
    Textbox email = new Textbox();

    // Date of Birth
    Label Dob = new Label("Date of Birth:");
    Datebox dob = new Datebox();
    
    // Gender
    Label Gender = new Label("Gender:");
    Radiogroup gender = new Radiogroup();
    Radio option1 = new Radio("Male");
    Radio option2 = new Radio("Female");
    
    // Submit Button
    Button submitButton = new Button("Submit");

    @Override
    protected void initForm() {
        // Create a container for all the form fields
        Vbox container = new Vbox();
        container.setSpacing("10px"); 
        
        // Add Name field
        container.appendChild(Name);
        container.appendChild(name);
        
        // Add Email field
        container.appendChild(Email);
        container.appendChild(email);
        
        // Add Date of Birth field
        container.appendChild(Dob);
        container.appendChild(dob);
        
        // Add Gender radio buttons
        container.appendChild(Gender);
        gender.appendChild(option1);
        gender.appendChild(option2);
        container.appendChild(gender);
        
        // Add Submit button
        container.appendChild(submitButton);

        // Add the container to the form
        this.appendChild(container);
        
        // Add an event listener to the submit button
        submitButton.addEventListener(Events.ON_CLICK, new EventListener<Event>() {
            @Override
            public void onEvent(Event event) throws Exception {
                // Print the form data to System.out
                System.out.println("Name: " + name.getRawValue());
                System.out.println("Email: " + email.getRawValue());
                System.out.println("Date of Birth: " + dob.getRawValue());
                System.out.println("Gender: " + (option1.isChecked() ? "Male" : "Female"));
            }
        });
    }

    @Override
    public void onEvent(Event event) throws Exception {
        // This method will remain empty as we are using the button's event listener
    }
}
