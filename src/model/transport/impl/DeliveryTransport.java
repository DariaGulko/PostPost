package model.transport.impl;

import model.person.Address;
import model.post.PostOffice;

/**
 * Created by Администратор on 09.11.2015.
 */
public class DeliveryTransport implements model.transport.DeliveryTransport {

    private Address startedPostOffice;
    private  Address destinationPostOffice;

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public PostOffice getStartPostOffice() {
        return (PostOffice) (PostOffice) startedPostOffice;
    }

    @Override
    public PostOffice getDestinationPostOffice() {
        return (PostOffice) (PostOffice) destinationPostOffice;
    }
}
