package com.yts.facades.cart;

import de.hybris.platform.commercefacades.order.data.CartData;

public interface YtsCartFacade {

    CartData getCartOnSession();
}
