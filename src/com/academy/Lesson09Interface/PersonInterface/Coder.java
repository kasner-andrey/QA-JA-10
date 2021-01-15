package com.academy.Lesson09Interface.PersonInterface;

public interface Coder {
    public void coding();

    default void engSpeacer(){
        System.out.println("Not speacer");
    }


}
