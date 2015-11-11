package service;

import model.post.PostOffice;
import model.transport.Transit;

import java.util.List;

/**
 * Created by Dariya on 04.11.2015.
 */
public interface SenderService {
    public List<PostOffice> getAllOffices();
    public List<Transit> calculatePossibleTransits(Package parcel);
    public boolean sendPackage(Package parcel, Transit transit);
    public PostOffice getPackageCurrentPosition(String id);
    public double getMilesToDestination(String id);
}
