package com.academy.Lesson09.PersonInterface;

public interface Coder {
    public void coding();

    default void engSpeacer(){
        System.out.println("Not speacer");
    }


}
