package service.impl;

import model.person.Address;
import model.post.Package;
import model.post.PostOffice;
import model.transport.DeliveryTransport;
import model.transport.Transit;
import service.Storage;



import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 * Created by Администратор on 11.11.2015.
 */
public class StorageHelper {
    public static final String TRANSIT_PREFIX = "_transit";
    public static final String POST_OFFICES_KEY = "postOffices";
    public static final String ADDRESSES_KEY = "addresses";
    public static final String DELIVERY_TRANSPORTS_KEY = "deliveryTransports";
    public static final String AVAILABLE_TRANSITS_KEY = "transits";

    public static void initializeData() {
        Random random = new Random();

        Storage.getInstance().putToStorage(ADDRESSES_KEY, Arrays.asList(
                new Address("Country 1", "City 1", "Street 1", 0),
                new Address("Country 2", "City 2", "Street 1", 1),
                new Address("Country 3", "City 3", "Street 1", 2),
                new Address("Country 4", "City 4", "Street 1", 3),
                new Address("Country 5", "City 5", "Street 1", 4),
                new Address("Country 6", "City 6", "Street 2", 5),
                new Address("Country 7", "City 7", "Street 3", 6),
                new Address("Country 8", "City 7", "Street 3", 7),
                new Address("Invalid Country", "Invalid City", "Invalid Street", 7)
        ));
        Storage.getInstance().putToStorage(POST_OFFICES_KEY, Arrays.asList(
                new model.post.PostOffice(new Address("Street 1", "City 1", "Country 1", 0), Package.Type.T_30, 30, new Point(0, 0)),
                new model.post.PostOffice(new Address("Street 2", "City 2", "Country 1", 1), Package.Type.T_30, 60, new Point(2, 3)),
                new model.post.PostOffice(new Address("Street 3", "City 3", "Country 1", 2), Package.Type.T_30, 45, new Point(5, 6)),
                new model.post.PostOffice(new Address("Street 4", "City 4", "Country 1", 3), Package.Type.T_30, 12, new Point(0, -10)),
                new model.post.PostOffice(new Address("Street 5", "City 5", "Country 1", 4), Package.Type.T_30, 10, new Point(5, 20)),
                new model.post.PostOffice(new Address("Street 6", "City 6", "Country 2", 5), Package.Type.T_30, 60, new Point(13, 45)),
                new model.post.PostOffice(new Address("Street 7", "City 7", "Country 3", 6), Package.Type.T_30, 96, new Point(9, 15)),
                new model.post.PostOffice(new Address("Street 8", "City 7", "Country 3", 7), Package.Type.T_30, 56, new Point(9, 15))
        ));
        Storage.getInstance().putToStorage(DELIVERY_TRANSPORTS_KEY, Arrays.asList(
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(0), getByPostCode(1)),
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(0), getByPostCode(2)),
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(0), getByPostCode(7)),
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(0), getByPostCode(5)),
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(1), getByPostCode(7)),
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(5), getByPostCode(3)),
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(5), getByPostCode(4)),
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(3), getByPostCode(4)),
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(7), getByPostCode(4)),
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(7), getByPostCode(6)),
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(4), getByPostCode(6)),
                new model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(0), getByPostCode(6))
        ));
        Storage.getInstance().putToStorage(AVAILABLE_TRANSITS_KEY, Arrays.asList(
                //from 1 to 2
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(4), getByPostCode(2)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(3), getByPostCode(5), getByPostCode(2)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(6), getByPostCode(7), getByPostCode(1)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(5), getByPostCode(4), getByPostCode(7), getByPostCode(1)), random.nextInt(100) + 20),
                //from 1 to 3
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(3)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(4), getByPostCode(2),getByPostCode(5),getByPostCode(3)), random.nextInt(100) + 20),
                //from 1 to 4
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(3), getByPostCode(2),getByPostCode(5),getByPostCode(4)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(4)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(5), getByPostCode(4), getByPostCode(3)), random.nextInt(100) + 20),
                //from 1 to 5
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(3), getByPostCode(5)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(4), getByPostCode(2),getByPostCode(5)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(6), getByPostCode(4)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(5), getByPostCode(3), getByPostCode(4)), random.nextInt(100) + 20),
                //from 0 to 5
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(5)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(7), getByPostCode(4), getByPostCode(5)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(6), getByPostCode(4), getByPostCode(5)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(7), getByPostCode(4), getByPostCode(3), getByPostCode(5)), random.nextInt(100) + 20),
                //from 0 to 6
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(6)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(7), getByPostCode(6)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(5), getByPostCode(4), getByPostCode(6)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(1), getByPostCode(7), getByPostCode(6)), random.nextInt(100) + 20),
                //from 0 to 7
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(1), getByPostCode(7)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(6), getByPostCode(7)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(5), getByPostCode(4), getByPostCode(7)), random.nextInt(100) + 20),

                //from 2 to 1
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(4), getByPostCode(1)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(5), getByPostCode(3), getByPostCode(1)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(7), getByPostCode(6), getByPostCode(0), getByPostCode(2)), random.nextInt(100) + 20),
                //from 2 to 3
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(5), getByPostCode(3)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(4), getByPostCode(1), getByPostCode(3)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(7), getByPostCode(6), getByPostCode(4), getByPostCode(3)), random.nextInt(100) + 20),
                //from 2 to 4
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(5), getByPostCode(3),getByPostCode(1),getByPostCode(4)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(4)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(7), getByPostCode(6), getByPostCode(4)), random.nextInt(100) + 20),
                //from 2 to 5
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(4), getByPostCode(1),getByPostCode(3),getByPostCode(5)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(5)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(7), getByPostCode(6), getByPostCode(4), getByPostCode(5)), random.nextInt(100) + 20),
                //from 1 to 6
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(7), getByPostCode(6)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(0), getByPostCode(6)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(7), getByPostCode(4), getByPostCode(6)), random.nextInt(100) + 20),
                //from 1 to 7
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(7)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(0), getByPostCode(6), getByPostCode(7)), random.nextInt(100) + 20),

                //from 3 to 1
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(3), getByPostCode(5), getByPostCode(2), getByPostCode(4), getByPostCode(1)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(3), getByPostCode(1)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(0), getByPostCode(5), getByPostCode(3)), random.nextInt(100) + 20),
                //from 3 to 2
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(3), getByPostCode(5), getByPostCode(2)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(3), getByPostCode(1), getByPostCode(4), getByPostCode(2)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(0), getByPostCode(5), getByPostCode(4)), random.nextInt(100) + 20),
                //from 3 to 4
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(3), getByPostCode(5), getByPostCode(2),getByPostCode(4)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(3), getByPostCode(1), getByPostCode(4)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(0), getByPostCode(6), getByPostCode(4), getByPostCode(5)), random.nextInt(100) + 20),
                //from 3 to 5
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(3), getByPostCode(1), getByPostCode(4),getByPostCode(2),getByPostCode(5)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(3), getByPostCode(5)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(0), getByPostCode(5), getByPostCode(4), getByPostCode(6)), random.nextInt(100) + 20),
                //from 2 to 7
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(0), getByPostCode(1), getByPostCode(7)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(0), getByPostCode(6), getByPostCode(7)), random.nextInt(100) + 20),

                //from 4 to 1
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(1)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(2), getByPostCode(5),getByPostCode(3), getByPostCode(1)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(5), getByPostCode(0), getByPostCode(7), getByPostCode(4)), random.nextInt(100) + 20),
                //from 4 to 2
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(1),getByPostCode(3),getByPostCode(5),getByPostCode(2)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(2)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(4), getByPostCode(7), getByPostCode(0), getByPostCode(5)), random.nextInt(100) + 20),
                //from 4 to 3
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(1), getByPostCode(3)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(2), getByPostCode(5), getByPostCode(3)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(5), getByPostCode(0), getByPostCode(6)), random.nextInt(100) + 20),
                //from 4 to 5
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(2), getByPostCode(5)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(1), getByPostCode(3), getByPostCode(5)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(5), getByPostCode(0), getByPostCode(6), getByPostCode(7)), random.nextInt(100) + 20),

                //from 4 to 5
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(5)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(3), getByPostCode(5)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(7), getByPostCode(0), getByPostCode(5)), random.nextInt(100) + 20),
                //from 4 to 6
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(6)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(7), getByPostCode(6)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(5), getByPostCode(0), getByPostCode(6)), random.nextInt(100) + 20),
                //from 4 to 7
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(7)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(6), getByPostCode(7)), random.nextInt(100) + 20),
                new com.logistic.impl.model.transport.Transit(Arrays.asList(
                        getByPostCode(4), getByPostCode(5), getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20),

                //from 5 to 1
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(5), getByPostCode(3),getByPostCode(1)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(5), getByPostCode(2), getByPostCode(4),getByPostCode(1)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(5), getByPostCode(5), getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20),
                //from 5 to 2
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(5), getByPostCode(3), getByPostCode(1),getByPostCode(4),getByPostCode(2)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(5), getByPostCode(2)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(5), getByPostCode(0), getByPostCode(7), getByPostCode(6)), random.nextInt(100) + 20),

                //from 5 to 3
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(5), getByPostCode(2),getByPostCode(4),getByPostCode(1),getByPostCode(3)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(5), getByPostCode(3)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(6), getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20)

                 //from 5 to 4
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(5), getByPostCode(2),getByPostCode(4)), random.nextInt(100) + 20),
                new model.transport.Transit(Arrays.asList(
                        getByPostCode(5), getByPostCode(3),getByPostCode(1),getByPostCode(4)), random.nextInt(100) + 20),
        ));
    }

    public static List<PostOffice> getAllOffices() {
        return Storage.getInstance().<List>getById(POST_OFFICES_KEY);
    }

    public static List<DeliveryTransport> getDeliveryTransports() {
        return Storage.getInstance().<List>getById(DELIVERY_TRANSPORTS_KEY);
    }

    public static List<Transit> getTransits() {
        return Storage.getInstance().<List>getById(AVAILABLE_TRANSITS_KEY);
    }

    public static void saveParcelTransit(Package parcel, Transit transit) {
        Storage.getInstance().putToStorage(parcel.getPackageId(), parcel);
        Storage.getInstance().putToStorage(parcel.getPackageId() + TRANSIT_PREFIX, transit);
    }

    public static PostOffice getByPostCode(int code) {
        List<PostOffice> offices = Storage.getInstance().<List>getById(POST_OFFICES_KEY);
        for(PostOffice postOffice : offices) {
            if(postOffice.getAddress().getCode() == code) {
                return postOffice;
            }
        }
        return null;
    }

    public static Package getPackage(String id){
        return Storage.getInstance().<Package>getById(id);
    }

    public static Transit getTransit(String id) {
        return Storage.getInstance().<Transit>getById(id + TRANSIT_PREFIX);
    }

    public static com.logistic.api.model.person.Address getRandomAddress(){
        Random random = new Random();
        List<Address> addresses = Storage.getInstance().<List>getById(ADDRESSES_KEY);
        return addresses.get(random.nextInt(addresses.size()));
    }
}
