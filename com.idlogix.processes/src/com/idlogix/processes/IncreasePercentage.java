package com.idlogix.processes;

import java.math.BigDecimal;
import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class IncreasePercentage extends SvrProcess {

    private BigDecimal percentage;

    @Override
    protected void prepare() {
        ProcessInfoParameter[] params = getParameter();
        for (ProcessInfoParameter param : params) {
            String paramName = param.getParameterName();
          
            if (paramName.equalsIgnoreCase("percentage")) {
                percentage = param.getParameterAsBigDecimal();
              
            } else {
                log.log(Level.SEVERE, "Unknown Parameter: " + paramName);
            }
        }
    }

    @Override
    protected String doIt() throws Exception {
     
        BigDecimal multiplier = BigDecimal.ONE.add(percentage.divide(BigDecimal.valueOf(100)));

        String sqlUpdate = "UPDATE adempiere.M_Product SET Price = Price * ?";

        int updatedRows = DB.executeUpdateEx(sqlUpdate, new Object[]{multiplier}, get_TrxName());

        return "Updated price for " + updatedRows + " products.";
    }
}
