package com.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ShippingAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ShippingAddressName;
    private String ShippingAddressStreet1;
    private String ShippingAddressStreet2;
    private String ShippingAddressCity;
    private String ShippingAddressState;
    private String ShippingAddressCountry;
    private String ShippingAddressZipcode;;

    @OneToOne
    private Order order;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShippingAddressName() {
        return this.ShippingAddressName;
    }

    public void setShippingAddressName(String ShippingAddressName) {
        this.ShippingAddressName = ShippingAddressName;
    }

    public String getShippingAddressStreet1() {
        return this.ShippingAddressStreet1;
    }

    public void setShippingAddressStreet1(String ShippingAddressStreet1) {
        this.ShippingAddressStreet1 = ShippingAddressStreet1;
    }

    public String getShippingAddressStreet2() {
        return this.ShippingAddressStreet2;
    }

    public void setShippingAddressStreet2(String ShippingAddressStreet2) {
        this.ShippingAddressStreet2 = ShippingAddressStreet2;
    }

    public String getShippingAddressCity() {
        return this.ShippingAddressCity;
    }

    public void setShippingAddressCity(String ShippingAddressCity) {
        this.ShippingAddressCity = ShippingAddressCity;
    }

    public String getShippingAddressState() {
        return this.ShippingAddressState;
    }

    public void setShippingAddressState(String ShippingAddressState) {
        this.ShippingAddressState = ShippingAddressState;
    }

    public String getShippingAddressCountry() {
        return this.ShippingAddressCountry;
    }

    public void setShippingAddressCountry(String ShippingAddressCountry) {
        this.ShippingAddressCountry = ShippingAddressCountry;
    }

    public String getShippingAddressZipcode() {
        return this.ShippingAddressZipcode;
    }

    public void setShippingAddressZipcode(String ShippingAddressZipcode) {
        this.ShippingAddressZipcode = ShippingAddressZipcode;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
