package model.post;

import model.person.IAddress;

import java.util.Date;
import java.util.Random;

/**
 * Created by Dariya on 04.11.2015.
 */
public interface IPackage {
    public IAddress getPostOfficeAddress();
    public Date getStampDate();
    public static enum Type {
        T_CP("����� �����"), T_30("������", 50), T_10("������� UPS 10 ��", 10),
        T_25("������� UPS 25 ��", 25), T_27("������� ������� UPS Express");

        private final String description;
        private final int maxWeight;

        private Type(String description) {
            this(description, 0);
        }

        private Type(String description, int maxWeight) {
            this.description = description;
            this.maxWeight = maxWeight;
        }

        public String getDescription() {
            return description;
        }

        public int getMaxWeight() {
            return maxWeight;
        }

        public static Type getRandomType() {
            Random r = new Random();
            return values()[r.nextInt(values().length)];
        }
    }
}
