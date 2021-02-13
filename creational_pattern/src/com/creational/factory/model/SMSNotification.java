package com.creational.factory.model;

public class SMSNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("SMS sent");
    }
}
