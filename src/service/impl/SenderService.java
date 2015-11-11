package service.impl;

import model.post.PostOffice;
import model.transport.Transit;

import java.util.List;

/**
 * Created by Администратор on 09.11.2015.
 */
public class SenderService implements service.SenderService {

    @Override
    public List<PostOffice> getAllOffices() {
        return null;
    }

    @Override
    public List<Transit> calculatePossibleTransits(Package parcel) {
        return null;
    }

    @Override
    public boolean sendPackage(Package parcel, Transit transit) {
        return false;
    }

    @Override
    public PostOffice getPackageCurrentPosition(String id) {
        return null;
    }

    @Override
    public double getMilesToDestination(String id) {
        return 0;
    }
}
