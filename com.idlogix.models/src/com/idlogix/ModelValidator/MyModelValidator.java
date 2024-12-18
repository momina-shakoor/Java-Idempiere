package com.idlogix.ModelValidator;


import org.compiere.model.MClient;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.model.PO;
import org.compiere.util.CLogger;

import com.idlogix.model.X_C_ProductReview;

public class MyModelValidator implements ModelValidator {

    private static final CLogger log = CLogger.getCLogger(MyModelValidator.class);

    @Override
    public void initialize(ModelValidationEngine engine, MClient client) {
        // Register this validator for the "C_ProductReview" table
        engine.addModelChange("C_ProductReview", this);
        log.info("Model Validator for C_ProductReview registered.");
    }

    @Override
    public int getAD_Client_ID() {
        return 0;  // For global validation, return 0
    }

    @Override
    public String modelChange(PO po, int type) throws Exception {

        if (po instanceof X_C_ProductReview) {
            X_C_ProductReview review = (X_C_ProductReview) po;

            String reviewText = review.getreviewtext();
            if (reviewText == null || reviewText.trim().isEmpty()) {
                return "Review text cannot be empty.";  
            }     
        }
        return null;  
    }

    @Override
    public String docValidate(PO po, int timing) {
        
        return null;  
    }

	@Override
	public String login(int AD_Org_ID, int AD_Role_ID, int AD_User_ID) {
		// TODO Auto-generated method stub
		return null;
	}
}
