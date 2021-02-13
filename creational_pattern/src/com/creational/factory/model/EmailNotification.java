package com.creational.factory.model;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Email sent");
    }
}
