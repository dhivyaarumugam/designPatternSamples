package designPatterns.factoryDesign;
/*
Factory pattern is a creational design pattern
*Define a factory method inside an interface.
*Let the subclass implements the above factory method and decides which object to create.
In Java, constructors are not polymorphic, but by allowing subclass to create an object,
 we are adding polymorphic behavior to the instantiation.
 In short, we are trying to achieve Pseudo polymorphism by letting the
 subclass to decide what to create, and so this
 Factory method is also called a virtual constructor.
 */
public class NotificationService {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        // Signal factory with input required
        Notification notification = notificationFactory.createNotification("SMS");
        // Calling factor method - outcome through notification
        notification.notifyUser();
    }
}

