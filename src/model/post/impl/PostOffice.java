package model.post.impl;


import model.person.Address;
import model.post.*;
import model.post.Package;
import model.post.Stamp;

import java.awt.*;
import java.util.Date;

public class PostOffice implements model.post.PostOffice {



     private  Address address;
     private model.post.Package.Type type;

    @Override
    public Stamp getStamp() {
        return new model.post.impl.Stamp(new Date(),getAddress());
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public Package.Type getAcceptableTypes() {
        return null;
    }

    /*@Override
    public Package.Type getAcceptableTypes() {
        return model.post.Package.Type type;
    }
*/
    @Override
    public int getMaxWeight() {
        return 0;
    }

    @Override
    public boolean sendPackage(Package parcel) {
        return false;
    }

    @Override
    public boolean receivePackage(Package parcel) {
        parcel.getStamps().add(getStamp());
        return true;
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public Point getGeolocation() {
        return null;
    }

}
