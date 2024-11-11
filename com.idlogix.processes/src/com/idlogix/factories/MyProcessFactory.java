package com.idlogix.factories;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;
import com.idlogix.processes.IncreasePercentage;
import com.idlogix.processes.MyProcess;

public class MyProcessFactory implements IProcessFactory{

	@Override
	public ProcessCall newProcessInstance(String className) {
		// TODO Auto-generated method stub
		
		if(className.equals("com.idlogix.processes.MyProcess")) {

			return new MyProcess();
		}
		else if(className.equals("com.idlogix.processes.IncreasePercentage")) {
			return new IncreasePercentage();
		}
		
		return null;
		
	}

}
