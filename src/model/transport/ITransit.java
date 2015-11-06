package model.transport;

import model.post.IPostOffice;

import java.util.List;

/**
 * Created by Dariya on 04.11.2015.
 */
public interface ITransit {
    public List<IPostOffice> getTransitOffices();
    public double getPrice();
}
