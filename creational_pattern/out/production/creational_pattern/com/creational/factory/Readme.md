**Sending various notifications**

Two type of notifications can be sent - Email and SMS. So we have created ‘NotificationExecutor’ interface, And two classes namely, ‘EmailNoificationExecutor’ and ‘SMSNotificationExecutor’ to implement this interface. Each one of these implementations have their own version of the method ‘executeNotification()’ within them.
Then we have created ‘NotificationExecutorFactory’ for providing the instance of a ‘NotificationExecutor’
We will use getNotificationExecutor() of factory class to get the desired instance by type
Client class called ‘NotificationSender’ will use factory to get instance and triggers notification sending action.

In this example, Buttons play a product role and dialogs act as creators.

Different types of dialogs require their own types of elements. That’s why we create a subclass for each dialog type and override their factory methods.

Now, each dialog type will instantiate proper button classes. Base dialog works with products using their common interface, that’s why its code remains functional after all changes.