package model.post;

import model.person.Address;
import java.awt.*;
/**
 * Created by Dariya on 04.11.2015.
 */
public interface PostOffice {
    public Stamp getStamp();
    public String getAddress();
    public Package.Type getAcceptableTypes();//*
    public int getMaxWeight();//*
    public boolean sendPackage(Package parcel);
    public boolean receivePackage(Package parcel);
    public int getCode();
    public Point getGeolocation();//*
}
