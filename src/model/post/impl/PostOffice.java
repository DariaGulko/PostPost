package model.post.impl;


import model.person.Address;
import model.post.Package;
import model.post.Stamp;


import java.util.Date;

import java.awt.*;

public class PostOffice implements model.post.PostOffice{
    private StampData stampData;
    private String address;
    private Package.Type type;
    private int weight;

    @Override
    public Stamp getStamp() {
        return stampData;
    }
//TODO переделать метод public Address getAddress()(связать его с интерфейсом Address)
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public Package.Type getAcceptableTypes() {
        return type;
    }

    @Override
    public int getMaxWeight() {
        return weight;
    }

    @Override
    public boolean sendPackage(Package parcel) {

        return !parcel.getReceiverAddress().equals(address);
    }
//TODO добавить в интерфейс Stamp метод addStamp() переделать метод receivePackage
    @Override
    public boolean receivePackage(Package parcel) {
        return false;
    }
//TODO сделать , чтобы address был объектом связанным с интерфейсом адресс и от него вызвать address.getCode()
    @Override
    public int getCode() {
        return 0;
    }
//TODO реализовать метод getGeolocation
    @Override
    public Point getGeolocation() {
        return null;
    }

    public class StampData implements  Stamp {
        private Address postOfficeAddress;
        private Date stampDate;

        public StampData(Address postOfficeAddress, Date stampDate) {
            this.postOfficeAddress = postOfficeAddress;
            this.stampDate = stampDate;
        }
        @Override
        public Address getPostOfficeAddress() {
            return this.postOfficeAddress;
        }

        @Override
        public Date getStampDate() {
            return this.stampDate;
        }
    }

}

