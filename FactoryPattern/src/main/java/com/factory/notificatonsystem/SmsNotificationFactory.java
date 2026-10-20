package com.factory.notificatonsystem;

public class SmsNotificationFactory implements NotificationFactory{
    @Override
    public NotificationInterface createNotifaction() {
        NotificationInterface sms= new SmsNotification();
        return sms;
    }
}
