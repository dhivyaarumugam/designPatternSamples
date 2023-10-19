package designPatterns.abstractFactoryDesign;

public class AirtelAbstractFactory {

    //NotificationAbstractService - Main Abstract factory pattern class is called
    //static method - you can call a static method without creating an object of the class.
    //Static variable - single copy of the variable is created and shared among all objects at the class level.
    //Static block can be printed without main method
    //Static Class - Static classes are sealed and therefore cannot be inherited.
    // They cannot inherit from any class or interface except Object.
    // Static classes cannot contain an instance constructor. However, they can contain a static constructor.
    static NotificationAbstractService buildNotification(NotificationType type)
    {
        NotificationAbstractService notify = null;
        //type string will be any of the one enums
        switch (type)
        {
            case NotificationType.SMS:
                notify = new SMSAbstractNotification(NetworkType.AIRTEL);
                break;

            case NotificationType.PUSH:
                notify = new PushAbstractNotification(NetworkType.AIRTEL);
                break;

            case NotificationType.EMAIL:
                notify = new EmailAbstractNotification(NetworkType.AIRTEL);
                break;

            default:
                break;

        }
        return notify;
    }
}
