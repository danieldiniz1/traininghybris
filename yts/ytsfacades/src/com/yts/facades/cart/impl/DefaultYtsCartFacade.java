package com.yts.facades.cart.impl;

import com.yts.facades.cart.YtsCartFacade;
import de.hybris.platform.commercefacades.order.data.CartData;

public class DefaultYtsCartFacade implements YtsCartFacade {


    @Override
    public CartData getCartOnSession() {
        return null;
    }
}
