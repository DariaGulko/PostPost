package model.transport.impl;

import model.post.PostOffice;

import java.util.List;

/**
 * Created by Dariya on 11.11.2015.
 */
public class Transit implements model.transport.Transit{
    private double price;
    private List<PostOffice> offices;
    //TODO не понятно что должно быть в этом методе
    @Override
    public List<PostOffice> getTransitOffices() {

        return null;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
