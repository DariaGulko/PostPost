package model.post.impl;

import model.person.Address;
import model.person.FullName;
import model.post.*;
import model.post.Stamp;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Администратор on 07.11.2015.
 */
public class Package implements model.post.Package {

    private int weight;
    private Address ReceiverAddress;
    private  Address SenderAddress;
    private int packageId;
    private FullName senderFullname;
    private FullName receiverFullname;
    private model.post.Package.Type type;
    private List<Stamp> stamps;

    public Package(int weight, Address receiverAddress, Address senderAddress, int packageId, FullName senderFullname, FullName receiverFullname, Type type, List<Stamp> stamps) {
        this.weight = weight;
        ReceiverAddress = receiverAddress;
        SenderAddress = senderAddress;
        this.packageId = packageId;
        this.senderFullname = senderFullname;
        this.receiverFullname = receiverFullname;
        this.type = type;
        this.stamps = stamps;
    }

    private int generateID(){
        Random random = new Random();
        return random.nextInt(999) + 1;

    }


    @Override
    public String getPackageId() {
        return "" + packageId;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public Address getReceiverAddress() {
        return ReceiverAddress;
    }

    @Override
    public Address getSenderAddress() {
        return SenderAddress;
    }

    @Override
    public FullName getSenderFullName() {
        return senderFullname;
    }

    @Override
    public FullName getReceiverFullName() {
        return receiverFullname;
    }

    @Override
    public List<Stamp> getStamps() {
        return stamps;
    }
}


