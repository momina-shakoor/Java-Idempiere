package com.idlogix.processes;

import java.math.BigDecimal;
import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

public class GeneratingReport extends SvrProcess{
	
	 private BigDecimal BpartnerID;


	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
		   ProcessInfoParameter[] params = getParameter();
	        for (ProcessInfoParameter param : params) {
	            String paramName = param.getParameterName();
	          
	            if (paramName.equalsIgnoreCase("C_BPartner_ID")) {
	            	BpartnerID = param.getParameterAsBigDecimal();
	              
	            } else {
	                log.log(Level.SEVERE, "Unknown Parameter: " + paramName);
	            }
	        }
	    }
		
	@Override
	protected String doIt() throws Exception {
	    if (BpartnerID != null) {
	        log.info("Generating report for BPartner ID: " + BpartnerID);
	        // Your report generation logic goes here, such as calling the Jasper report generation
	        // e.g., passing BpartnerID as a parameter to the Jasper report

	        // You can also add further business logic here to interact with the database
	        return "Report Generated Successfully";
	    } else {
	        log.log(Level.SEVERE, "BPartner ID not provided");
	        return "Error: BPartner ID not provided";
	    }
	}

}
