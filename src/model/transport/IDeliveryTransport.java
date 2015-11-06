package model.transport;

import model.post.IPostOffice;

/**
 * Created by Dariya on 04.11.2015.
 */
public interface IDeliveryTransport {
    public Type getType();
    public IPostOffice getStartPostOffice();
    public IPostOffice getDestinationPostOffice();

    public static enum Type {
        SEA(10, 2.5), AIR(50, 25.2), LAND(18, 1.26);

        private int speed;
        private double costPerMile;

        private Type(int speed, double costPerMile) {
            this.speed = speed;
            this.costPerMile = costPerMile;
        }

        public int getSpeed() {
            return speed;
        }

        public double getCostPerMile() {
            return costPerMile;
        }
    }
}
