package model.post;

import model.person.IAddress;

import java.util.Date;

/**
 * Created by Dariya on 04.11.2015.
 */
public interface IStamp {
    public IAddress getPostOfficeAddress();
    public Date getStampDate();
}
