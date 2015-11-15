package model.transport.impl;

import model.post.PostOffice;

/**
 * Created by Dariya on 11.11.2015.
 */
public class DeliveryTransport implements model.transport.DeliveryTransport{
    private Type type;
    private PostOffice startPostOffice;
    private PostOffice destinationPostOffice;
    @Override
    public Type getType() {
        return type;
    }

    @Override
    public PostOffice getStartPostOffice() {
        return startPostOffice;
    }

    @Override
    public PostOffice getDestinationPostOffice() {
        return destinationPostOffice;
    }
}
