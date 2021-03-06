package model.person.impl;

import model.person.Address;
import model.person.FullName;

/**
 * Created by Dariya on 05.11.2015.
 */
public class Person implements model.person.Person {
    private FullNameData nameData;
    private AddressData addressData;

    public Person(String firstName, String lastName, String middleName, String country, String city, String street, int code) {
        nameData = new FullNameData(firstName, lastName, middleName);
        addressData = new AddressData(country, city, street, code);
    }

    @Override
    public Address getAddress() {
        return addressData;
    }

    @Override
    public FullName getFullName() {
        return nameData;
    }

    private class FullNameData implements FullName {
        private String FirstName;
        private String LastName;
        private String MiddleName;

        public FullNameData(String firstName, String lastName, String middleName) {
            FirstName = firstName;
            LastName = lastName;
            MiddleName = middleName;
        }

        @Override
        public String getFirstName() {
            return FirstName;
        }

        @Override
        public String getLastName() {
            return LastName;
        }

        @Override
        public String getMiddleName() {
            return MiddleName;
        }
    }

    private class AddressData implements Address {
        private String country;
        private String city;
        private String street;
        private int code;

        public AddressData(String country, String city, String street, int code) {
            this.country = country;
            this.city = city;
            this.street = street;
            this.code = code;
        }

        @Override
        public String getCountry() {
            return country;
        }

        @Override
        public String getCity() {
            return city;
        }

        @Override
        public String getStreet() {
            return street;
        }

        @Override
        public int getCode() {
            return code;
        }
    }

}
