package model.transport.impl;

import model.post.PostOffice;
import model.transport.*;
import model.transport.DeliveryTransport;

/**
 * Created by Администратор on 09.11.2015.
 */
public class Transit  implements model.transport.DeliveryTransport{

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public PostOffice getStartPostOffice() {
        return null;
    }

    @Override
    public PostOffice getDestinationPostOffice() {
        return null;
    }
}
