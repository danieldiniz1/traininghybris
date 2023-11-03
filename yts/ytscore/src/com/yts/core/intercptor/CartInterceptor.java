package com.yts.core.intercptor;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.Interceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.time.Instant;
import java.util.Date;

public class CartInterceptor implements InitDefaultsInterceptor<CartModel> {
    @Override
    public void onInitDefaults(CartModel cartModel, InterceptorContext interceptorContext) throws InterceptorException {
        cartModel.setDateIsSave(Date.from(Instant.now()));
        if (!cartModel.isIsValidByIntercept())
            cartModel.setIsValidByIntercept(Boolean.TRUE);
    }
}
