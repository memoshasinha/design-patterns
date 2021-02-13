**Sending various notifications**

Two type of notifications can be sent - Email and SMS. So we have created ‘Notification’ interface,
And two classes namely, ‘EmailNotification’ and ‘SMSNotification’ to implement this interface. Each one of these 
implementations have their own version of the method ‘executeNotification()’ within them. Then we have created
‘NotificationFactory’ for providing the instance of a ‘NotificationExecutor'. We will use getNotificationExecutor() of
factory class to get the desired instance by type Client class called ‘NotificationSender’ will use factory to get 
instance and triggers notification sending action.