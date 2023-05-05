package com.company;
class EventRegistration{
        String name;
        String nameOfEvent;


    public void registerEvent(){


    }
}
class SingleEventRegistration extends EventRegistration{
    int participantNo;
    SingleEventRegistration(String name,String nameOfEvent,int participantNo){
//        super();
        this.name = name;
            this.nameOfEvent = nameOfEvent;
            this.participantNo = participantNo;
    }





}
class TeamEventRegistration extends EventRegistration{

}

public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        EventRegistration obj = new SingleEventRegistration("Jenny","Sing&Win",1);


    }
}
