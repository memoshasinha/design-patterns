package com.creational.factory.client;

import com.creational.factory.factory.NotificationFactory;

public class NotificationSender {
    public static void main(String[] args) {
        NotificationFactory.getInstance("Email").sendNotification();
    }
}
