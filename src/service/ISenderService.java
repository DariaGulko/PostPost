package service;

import model.post.IPostOffice;
import model.transport.ITransit;

import java.util.List;

/**
 * Created by Dariya on 04.11.2015.
 */
public interface ISenderService {
    public List<IPostOffice> getAllOffices();
    public List<ITransit> calculatePossibleTransits(Package parcel);
    public boolean sendPackage(Package parcel, ITransit transit);
    public IPostOffice getPackageCurrentPosition(String id);
    public double getMilesToDestination(String id);
}
