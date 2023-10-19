package designPatterns.abstractFactoryDesign;

public class JIOAbstractFactory {
    static NotificationAbstractService buildNotification(NotificationType type)
    {
        NotificationAbstractService notify = null;
        //type string will be any of the one enums
        switch (type)
        {
            case NotificationType.SMS:
                notify = new SMSAbstractNotification(NetworkType.JIO);
                break;

            case NotificationType.PUSH:
                notify = new PushAbstractNotification(NetworkType.JIO);
                break;

            case NotificationType.EMAIL:
                notify = new EmailAbstractNotification(NetworkType.JIO);
                break;

            default:
                break;

        }
        return notify;
    }
}
