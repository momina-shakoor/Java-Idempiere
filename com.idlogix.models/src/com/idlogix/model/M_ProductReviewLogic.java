package com.idlogix.model;

import java.util.Properties;

@org.adempiere.base.Model(table="C_ProductReview")

public class M_ProductReviewLogic extends X_C_ProductReview{

	public M_ProductReviewLogic(Properties ctx, int C_ProductReview_ID, String trxName) {
		super(ctx, C_ProductReview_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		if(getRating() == 1) {
			setreviewstatus("Needs Attention");
			
		}
		else {
			setreviewstatus("Normal");
		}
		return super.beforeSave(newRecord);
	}

}
