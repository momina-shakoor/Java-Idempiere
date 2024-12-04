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

    // Form components
    Label titleLabel = new Label("Form");
    Label nameLabel = new Label("Name:");
    Textbox nameTextbox = new Textbox();
    
    Label emailLabel = new Label("Email:");
    Textbox emailTextbox = new Textbox();

    Label dobLabel = new Label("Date of Birth:");
    Datebox dobDatebox = new Datebox();

    Label genderLabel = new Label("Gender:");
    Radiogroup genderRadiogroup = new Radiogroup();
    Radio maleRadio = new Radio("Male");
    Radio femaleRadio = new Radio("Female");

    Button submitButton = new Button("Submit");

    @Override
    protected void initForm() {
        // Container styling
        Vbox container = new Vbox();
        container.setStyle("background: linear-gradient(to right, #74b9ff, #0e85fc); padding: 30px; border-radius: 15px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); width: 400px; margin: auto;");

        // Title styling
        titleLabel.setStyle("font-size: 24px; font-weight: bold; color: #343a40; margin-bottom: 20px; text-align: center;");
        container.appendChild(titleLabel);

        // Name field
        nameLabel.setStyle("font-size: 14px; color: #495057; margin-bottom: 5px;");
        nameTextbox.setStyle("width: 100%; padding: 10px; border: 1px solid #ced4da; border-radius: 5px; margin-bottom: 15px;");
        container.appendChild(nameLabel);
        container.appendChild(nameTextbox);

        // Email field
        emailLabel.setStyle("font-size: 14px; color: #495057; margin-bottom: 5px;");
        emailTextbox.setStyle("width: 100%; padding: 10px; border: 1px solid #ced4da; border-radius: 5px; margin-bottom: 15px;");
        container.appendChild(emailLabel);
        container.appendChild(emailTextbox);

        // Date of Birth field
        dobLabel.setStyle("font-size: 14px; color: #495057; margin-bottom: 5px;");
        dobDatebox.setStyle("width: 100%; padding: 10px; border: 1px solid #ced4da; border-radius: 5px; margin-bottom: 15px;");
        container.appendChild(dobLabel);
        container.appendChild(dobDatebox);

        // Gender options
        genderLabel.setStyle("font-size: 14px; color: #495057; margin-bottom: 5px;");
        genderRadiogroup.setStyle("display: flex; justify-content: space-between; margin-bottom: 15px;");
        maleRadio.setStyle("margin-right: 2px; color: #495057;");
        femaleRadio.setStyle("color: #495057;");
        genderRadiogroup.appendChild(maleRadio);
        genderRadiogroup.appendChild(femaleRadio);
        container.appendChild(genderLabel);
        container.appendChild(genderRadiogroup);

        // Submit button
        submitButton.setStyle("background: #007BFF; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer; text-align: center; font-size: 14px;");
        submitButton.addEventListener(Events.ON_MOUSE_OVER, event -> submitButton.setStyle("background: #0056b3; color: white;"));
        submitButton.addEventListener(Events.ON_MOUSE_OUT, event -> submitButton.setStyle("background: #007BFF; color: white;"));
        container.appendChild(submitButton);

        // Append container to the form
        this.appendChild(container);

        // Add event listener for submit button
        submitButton.addEventListener(Events.ON_CLICK, new EventListener<Event>() {
            @Override
            public void onEvent(Event event) throws Exception {
                System.out.println("Name: " + nameTextbox.getRawValue());
                System.out.println("Email: " + emailTextbox.getRawValue());
                System.out.println("Date of Birth: " + dobDatebox.getRawValue());
                System.out.println("Gender: " + (maleRadio.isChecked() ? "Male" : "Female"));
            }
        });
    }

    
}
