/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2 de nov. de 2023 21:53:34                  ---
 * ----------------------------------------------------------------
 */
package com.yts.core.jalo;

import com.yts.core.constants.YtsCoreConstants;
import com.yts.core.jalo.ApparelProduct;
import com.yts.core.jalo.ApparelSizeVariantProduct;
import com.yts.core.jalo.ApparelStyleVariantProduct;
import com.yts.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.order.Cart;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>YtsCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedYtsCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("isValid", AttributeMode.INITIAL);
		tmp.put("isValidByIntercept", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrder", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("customDescription", AttributeMode.INITIAL);
		tmp.put("customFieldIntercptor", AttributeMode.INITIAL);
		tmp.put("customFieldIntercptorSave", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("dateIsSave", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Cart", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YtsCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YtsCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YtsCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YtsCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.customDescription</code> attribute.
	 * @return the customDescription - The point of service to deliver to/collect from.
	 */
	public String getCustomDescription(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, YtsCoreConstants.Attributes.AbstractOrderEntry.CUSTOMDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.customDescription</code> attribute.
	 * @return the customDescription - The point of service to deliver to/collect from.
	 */
	public String getCustomDescription(final AbstractOrderEntry item)
	{
		return getCustomDescription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.customDescription</code> attribute. 
	 * @param value the customDescription - The point of service to deliver to/collect from.
	 */
	public void setCustomDescription(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, YtsCoreConstants.Attributes.AbstractOrderEntry.CUSTOMDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.customDescription</code> attribute. 
	 * @param value the customDescription - The point of service to deliver to/collect from.
	 */
	public void setCustomDescription(final AbstractOrderEntry item, final String value)
	{
		setCustomDescription( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.customFieldIntercptor</code> attribute.
	 * @return the customFieldIntercptor - value of to change by intercptor
	 */
	public String getCustomFieldIntercptor(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, YtsCoreConstants.Attributes.AbstractOrderEntry.CUSTOMFIELDINTERCPTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.customFieldIntercptor</code> attribute.
	 * @return the customFieldIntercptor - value of to change by intercptor
	 */
	public String getCustomFieldIntercptor(final AbstractOrderEntry item)
	{
		return getCustomFieldIntercptor( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.customFieldIntercptor</code> attribute. 
	 * @param value the customFieldIntercptor - value of to change by intercptor
	 */
	public void setCustomFieldIntercptor(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, YtsCoreConstants.Attributes.AbstractOrderEntry.CUSTOMFIELDINTERCPTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.customFieldIntercptor</code> attribute. 
	 * @param value the customFieldIntercptor - value of to change by intercptor
	 */
	public void setCustomFieldIntercptor(final AbstractOrderEntry item, final String value)
	{
		setCustomFieldIntercptor( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.customFieldIntercptorSave</code> attribute.
	 * @return the customFieldIntercptorSave - value of to change by intercptor
	 */
	public Boolean isCustomFieldIntercptorSave(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Boolean)item.getProperty( ctx, YtsCoreConstants.Attributes.AbstractOrderEntry.CUSTOMFIELDINTERCPTORSAVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.customFieldIntercptorSave</code> attribute.
	 * @return the customFieldIntercptorSave - value of to change by intercptor
	 */
	public Boolean isCustomFieldIntercptorSave(final AbstractOrderEntry item)
	{
		return isCustomFieldIntercptorSave( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.customFieldIntercptorSave</code> attribute. 
	 * @return the customFieldIntercptorSave - value of to change by intercptor
	 */
	public boolean isCustomFieldIntercptorSaveAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Boolean value = isCustomFieldIntercptorSave( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.customFieldIntercptorSave</code> attribute. 
	 * @return the customFieldIntercptorSave - value of to change by intercptor
	 */
	public boolean isCustomFieldIntercptorSaveAsPrimitive(final AbstractOrderEntry item)
	{
		return isCustomFieldIntercptorSaveAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.customFieldIntercptorSave</code> attribute. 
	 * @param value the customFieldIntercptorSave - value of to change by intercptor
	 */
	public void setCustomFieldIntercptorSave(final SessionContext ctx, final AbstractOrderEntry item, final Boolean value)
	{
		item.setProperty(ctx, YtsCoreConstants.Attributes.AbstractOrderEntry.CUSTOMFIELDINTERCPTORSAVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.customFieldIntercptorSave</code> attribute. 
	 * @param value the customFieldIntercptorSave - value of to change by intercptor
	 */
	public void setCustomFieldIntercptorSave(final AbstractOrderEntry item, final Boolean value)
	{
		setCustomFieldIntercptorSave( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.customFieldIntercptorSave</code> attribute. 
	 * @param value the customFieldIntercptorSave - value of to change by intercptor
	 */
	public void setCustomFieldIntercptorSave(final SessionContext ctx, final AbstractOrderEntry item, final boolean value)
	{
		setCustomFieldIntercptorSave( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.customFieldIntercptorSave</code> attribute. 
	 * @param value the customFieldIntercptorSave - value of to change by intercptor
	 */
	public void setCustomFieldIntercptorSave(final AbstractOrderEntry item, final boolean value)
	{
		setCustomFieldIntercptorSave( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.dateIsSave</code> attribute.
	 * @return the dateIsSave - The date/time when the cart was saved.
	 */
	public Date getDateIsSave(final SessionContext ctx, final Cart item)
	{
		return (Date)item.getProperty( ctx, YtsCoreConstants.Attributes.Cart.DATEISSAVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.dateIsSave</code> attribute.
	 * @return the dateIsSave - The date/time when the cart was saved.
	 */
	public Date getDateIsSave(final Cart item)
	{
		return getDateIsSave( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.dateIsSave</code> attribute. 
	 * @param value the dateIsSave - The date/time when the cart was saved.
	 */
	public void setDateIsSave(final SessionContext ctx, final Cart item, final Date value)
	{
		item.setProperty(ctx, YtsCoreConstants.Attributes.Cart.DATEISSAVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.dateIsSave</code> attribute. 
	 * @param value the dateIsSave - The date/time when the cart was saved.
	 */
	public void setDateIsSave(final Cart item, final Date value)
	{
		setDateIsSave( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return YtsCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.isValid</code> attribute.
	 * @return the isValid
	 */
	public Boolean isIsValid(final SessionContext ctx, final AbstractOrder item)
	{
		return (Boolean)item.getProperty( ctx, YtsCoreConstants.Attributes.AbstractOrder.ISVALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.isValid</code> attribute.
	 * @return the isValid
	 */
	public Boolean isIsValid(final AbstractOrder item)
	{
		return isIsValid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.isValid</code> attribute. 
	 * @return the isValid
	 */
	public boolean isIsValidAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Boolean value = isIsValid( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.isValid</code> attribute. 
	 * @return the isValid
	 */
	public boolean isIsValidAsPrimitive(final AbstractOrder item)
	{
		return isIsValidAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.isValid</code> attribute. 
	 * @param value the isValid
	 */
	public void setIsValid(final SessionContext ctx, final AbstractOrder item, final Boolean value)
	{
		item.setProperty(ctx, YtsCoreConstants.Attributes.AbstractOrder.ISVALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.isValid</code> attribute. 
	 * @param value the isValid
	 */
	public void setIsValid(final AbstractOrder item, final Boolean value)
	{
		setIsValid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.isValid</code> attribute. 
	 * @param value the isValid
	 */
	public void setIsValid(final SessionContext ctx, final AbstractOrder item, final boolean value)
	{
		setIsValid( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.isValid</code> attribute. 
	 * @param value the isValid
	 */
	public void setIsValid(final AbstractOrder item, final boolean value)
	{
		setIsValid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.isValidByIntercept</code> attribute.
	 * @return the isValidByIntercept
	 */
	public Boolean isIsValidByIntercept(final SessionContext ctx, final AbstractOrder item)
	{
		return (Boolean)item.getProperty( ctx, YtsCoreConstants.Attributes.AbstractOrder.ISVALIDBYINTERCEPT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.isValidByIntercept</code> attribute.
	 * @return the isValidByIntercept
	 */
	public Boolean isIsValidByIntercept(final AbstractOrder item)
	{
		return isIsValidByIntercept( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.isValidByIntercept</code> attribute. 
	 * @return the isValidByIntercept
	 */
	public boolean isIsValidByInterceptAsPrimitive(final SessionContext ctx, final AbstractOrder item)
	{
		Boolean value = isIsValidByIntercept( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.isValidByIntercept</code> attribute. 
	 * @return the isValidByIntercept
	 */
	public boolean isIsValidByInterceptAsPrimitive(final AbstractOrder item)
	{
		return isIsValidByInterceptAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.isValidByIntercept</code> attribute. 
	 * @param value the isValidByIntercept
	 */
	public void setIsValidByIntercept(final SessionContext ctx, final AbstractOrder item, final Boolean value)
	{
		item.setProperty(ctx, YtsCoreConstants.Attributes.AbstractOrder.ISVALIDBYINTERCEPT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.isValidByIntercept</code> attribute. 
	 * @param value the isValidByIntercept
	 */
	public void setIsValidByIntercept(final AbstractOrder item, final Boolean value)
	{
		setIsValidByIntercept( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.isValidByIntercept</code> attribute. 
	 * @param value the isValidByIntercept
	 */
	public void setIsValidByIntercept(final SessionContext ctx, final AbstractOrder item, final boolean value)
	{
		setIsValidByIntercept( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.isValidByIntercept</code> attribute. 
	 * @param value the isValidByIntercept
	 */
	public void setIsValidByIntercept(final AbstractOrder item, final boolean value)
	{
		setIsValidByIntercept( getSession().getSessionContext(), item, value );
	}
	
}
