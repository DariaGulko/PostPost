package model.post;

import model.person.Address;

import java.util.Date;

/**
 * Created by Dariya on 04.11.2015.
 */
public interface Stamp {
    public Address getPostOfficeAddress();
    public Date getStampDate();

}
