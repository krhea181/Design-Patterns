package com.factory.notificatonsystem;

import java.util.Scanner;

public class ClientBase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the value");
        String input = scanner.nextLine();
        NotificationFactory notificationFactory=null;
        if(input.equalsIgnoreCase("SMS")){
            notificationFactory = new SmsNotificationFactory();
        }else if(input.equalsIgnoreCase("Whatsapp")){
            notificationFactory = new WhatsappNotificationFactory();
        }
        if(notificationFactory != null) {
            notificationFactory.createNotifaction().send();
        }
    }
}
