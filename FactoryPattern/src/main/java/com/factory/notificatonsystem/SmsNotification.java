package com.factory.notificatonsystem;

public class SmsNotification implements NotificationInterface{
    @Override
    public void send(){
        System.out.println("Sms notification is sent!!");
    }
}
