package com.academy.lesson06;

import java.util.Objects;

public class KlassWork {
    private  String name;
    private  String address;


    //Constructor
    public KlassWork(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {return name;}

    public String getAddress() {return address;}

    public void setName(String name) {this.name = name;}

    public void setAddress(String address) {this.address = address;}

    //nasledovanie


    @Override
    public String toString() {
        return "KlassWork{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KlassWork klassWork = (KlassWork) o;
        return Objects.equals(name, klassWork.name) &&
                Objects.equals(address, klassWork.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
