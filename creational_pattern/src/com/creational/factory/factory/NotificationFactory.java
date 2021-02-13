package com.creational.factory.factory;

import com.creational.factory.model.EmailNotification;
import com.creational.factory.model.Notification;
import com.creational.factory.model.SMSNotification;

public class NotificationFactory {
    public static Notification getInstance(String executorType) {
        if(executorType.equals("Email"))
            return new EmailNotification();
        if(executorType.equals("SMS"))
            return new SMSNotification();
        return null;
    }
}
