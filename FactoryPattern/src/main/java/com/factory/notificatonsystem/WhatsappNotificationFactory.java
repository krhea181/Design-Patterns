package com.factory.notificatonsystem;

public class WhatsappNotificationFactory implements NotificationFactory{
    @Override
    public NotificationInterface createNotifaction() {
        NotificationInterface whatsapp = new WhatsappNotification();
        return whatsapp;
    }
}
