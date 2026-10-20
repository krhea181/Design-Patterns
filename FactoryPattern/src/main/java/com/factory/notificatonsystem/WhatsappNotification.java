package com.factory.notificatonsystem;

public class WhatsappNotification implements NotificationInterface{

    @Override
    public void send() {
        System.out.println("Whatsapp notification send!!");
    }
}
