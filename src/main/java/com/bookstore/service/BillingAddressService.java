package com.bookstore.service;

import com.bookstore.domain.BillingAddress;
import com.bookstore.domain.ShippingAddress;
import com.bookstore.domain.UserBilling;

import org.springframework.stereotype.Service;

@Service
public interface BillingAddressService {

    BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);

    BillingAddress setByUserShippingAddress(ShippingAddress shippingAddress, BillingAddress billingAddress);

}