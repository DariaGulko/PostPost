package model.transport;

import model.post.PostOffice;

import java.util.List;

/**
 * Created by Dariya on 04.11.2015.
 */
public interface Transit {
    public List<PostOffice> getTransitOffices();
    public double getPrice();
}
