/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.yts.custom.controllers;

import com.yts.facades.cart.YtsCartFacade;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commerceservices.request.mapping.annotation.ApiVersion;
import de.hybris.platform.commercewebservicescommons.dto.order.CartWsDTO;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import de.hybris.platform.webservicescommons.mapping.FieldSetLevelHelper;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdUserIdAndCartIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;

@Controller
@ApiVersion("v2")
//@Tag(name = "YtsoccController")
public class YtsoccController {

    private static final String DEFAULT_FIELS_SET = FieldSetLevelHelper.DEFAULT_LEVEL;

    @Resource(name = "dataMapper")
    private DataMapper dataMapper;

    @Resource(name = "ytsCartFacade")
    private YtsCartFacade cartFacade;


    @GetMapping("/users/{userID}/carts/{cartId}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @ApiBaseSiteIdUserIdAndCartIdParam
    public CartWsDTO getCartOnSession(
            @ApiFieldsParam @RequestParam(required = false, defaultValue = DEFAULT_FIELS_SET) final String fields){
        CartData cart = cartFacade.getCartOnSession();
        return dataMapper.map(cart,CartWsDTO.class,fields);
    }

}
