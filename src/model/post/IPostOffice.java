package model.post;

import model.person.IAddress;
import java.awt.*;
/**
 * Created by Dariya on 04.11.2015.
 */
public interface IPostOffice {
    public IStamp getStamp();
    public IAddress getAddress();
    public Package.Type getAcceptableTypes();
    public int getMaxWeight();
    public boolean sendPackage(Package parcel);
    public boolean receivePackage(Package parcel);
    public int getCode();
    public Point getGeolocation();
}
