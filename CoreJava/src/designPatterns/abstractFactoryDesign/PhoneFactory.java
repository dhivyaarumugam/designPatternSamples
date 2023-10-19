package designPatterns.abstractFactoryDesign;

public class PhoneFactory {
    private PhoneFactory()
    {

    }
    public static NotificationAbstractService sendPhoneNotification(NotificationType type,NetworkType network)
    {
        //This is a enhanced switch - advance Java
        return switch (network) {
            case NetworkType.VODAPHONE -> {
                yield VodaphoneAbstractFactory.buildNotification(type);
            }
            case NetworkType.JIO -> JIOAbstractFactory.buildNotification(type);
            default -> AirtelAbstractFactory.buildNotification(type);
        };
    }
}

