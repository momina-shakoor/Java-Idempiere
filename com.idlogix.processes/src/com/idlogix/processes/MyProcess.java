package com.idlogix.processes;

import java.math.BigDecimal;
import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
//@org.adempiere.base.annotation.Process
public class MyProcess extends SvrProcess {

    private String aString;
    private boolean aCheckbox;
    private java.sql.Timestamp aDatetime;

    @Override
    protected void prepare() {
        ProcessInfoParameter[] params = getParameter();
        for (ProcessInfoParameter param : params) {
            String paramName = param.getParameterName();

            if (paramName.equalsIgnoreCase("astring")) {
                aString = param.getParameterAsString();
            } else if (paramName.equalsIgnoreCase("acheckbox")) {
                aCheckbox = param.getParameterAsBoolean();
            } else if (paramName.equalsIgnoreCase("adatetime")) {
                aDatetime = param.getParameterAsTimestamp();
            } else {
                log.log(Level.SEVERE, "Unknown Parameter: " + paramName);
            }
        }
    }

    @Override
    protected String doIt() throws Exception {
        
        addLog("Received string: " + aString);
        addLog(1000000, aDatetime, BigDecimal.ONE, "Our Datetime is " + aDatetime);
      //addLog(id, date,number,message ,tableId,recordId)
        addLog(1000000, aDatetime, BigDecimal.ONE, "Our Checkbox is " + aCheckbox, 100, 100);

        
        return "Process completed successfully";
    }
}
