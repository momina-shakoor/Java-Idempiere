/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package com.idlogix.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for C_ProductReview
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="C_ProductReview")
public class X_C_ProductReview extends PO implements I_C_ProductReview, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241106L;

    /** Standard Constructor */
    public X_C_ProductReview (Properties ctx, int C_ProductReview_ID, String trxName)
    {
      super (ctx, C_ProductReview_ID, trxName);
      /** if (C_ProductReview_ID == 0)
        {
			setC_ProductReview_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_C_ProductReview (Properties ctx, int C_ProductReview_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_ProductReview_ID, trxName, virtualColumns);
      /** if (C_ProductReview_ID == 0)
        {
			setC_ProductReview_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_C_ProductReview (Properties ctx, String C_ProductReview_UU, String trxName)
    {
      super (ctx, C_ProductReview_UU, trxName);
      /** if (C_ProductReview_UU == null)
        {
			setC_ProductReview_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_C_ProductReview (Properties ctx, String C_ProductReview_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_ProductReview_UU, trxName, virtualColumns);
      /** if (C_ProductReview_UU == null)
        {
			setC_ProductReview_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_ProductReview (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_C_ProductReview[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set ProductReview.
		@param C_ProductReview_ID ProductReview
	*/
	public void setC_ProductReview_ID (int C_ProductReview_ID)
	{
		if (C_ProductReview_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_ProductReview_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_ProductReview_ID, Integer.valueOf(C_ProductReview_ID));
	}

	/** Get ProductReview.
		@return ProductReview	  */
	public int getC_ProductReview_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ProductReview_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
	{
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_ID)
			.getPO(getM_Product_ID(), get_TrxName());
	}

	/** Set Product.
		@param M_Product_ID Product, Service, Item
	*/
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1)
			set_Value (COLUMNNAME_M_Product_ID, null);
		else
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Rating.
		@param Rating Classification or Importance
	*/
	public void setRating (int Rating)
	{
		set_Value (COLUMNNAME_Rating, Integer.valueOf(Rating));
	}

	/** Get Rating.
		@return Classification or Importance
	  */
	public int getRating()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Rating);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set reviewdate.
		@param reviewdate reviewdate
	*/
	public void setreviewdate (Timestamp reviewdate)
	{
		set_Value (COLUMNNAME_reviewdate, reviewdate);
	}

	/** Get reviewdate.
		@return reviewdate	  */
	public Timestamp getreviewdate()
	{
		return (Timestamp)get_Value(COLUMNNAME_reviewdate);
	}

	/** Set reviewstatus.
		@param reviewstatus reviewstatus
	*/
	public void setreviewstatus (String reviewstatus)
	{
		set_Value (COLUMNNAME_reviewstatus, reviewstatus);
	}

	/** Get reviewstatus.
		@return reviewstatus	  */
	public String getreviewstatus()
	{
		return (String)get_Value(COLUMNNAME_reviewstatus);
	}

	/** Set reviewtext.
		@param reviewtext reviewtext
	*/
	public void setreviewtext (String reviewtext)
	{
		set_Value (COLUMNNAME_reviewtext, reviewtext);
	}

	/** Get reviewtext.
		@return reviewtext	  */
	public String getreviewtext()
	{
		return (String)get_Value(COLUMNNAME_reviewtext);
	}
}