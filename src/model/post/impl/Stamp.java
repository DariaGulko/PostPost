package model.post.impl;

import model.person.Address;

import java.util.Date;


public class Stamp implements model.post.Stamp {

    public Stamp(Date stampDate, Address postOfficeAddress) {
        this.stampDate = stampDate;
        this.postOfficeAddress = postOfficeAddress;
    }

    private Address postOfficeAddress;
    private  Date stampDate;


    @Override
    public Address getPostOfficeAddress() {
        return this.postOfficeAddress;
    }

    @Override
    public Date getStampDate() {
        return this.stampDate;
    }
}
