package com.academy.Lesson11;

public class Pair2<U, V> {
    private U first;
    private V second;

    public Pair2() {
    }

    public Pair2(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(U first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }



}
