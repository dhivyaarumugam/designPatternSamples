package designPatterns.abstractFactoryDesign;
/*
Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products, for example we can add another sub-class Laptop and a factory LaptopFactory.
Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.
 */
public class PhoneNetworkAbstractDesign {

        public static void main(String[] args)
        {

        }

        static {
            System.out.println(PhoneFactory.sendPhoneNotification(NotificationType.SMS,NetworkType.VODAPHONE));
            System.out.println(PhoneFactory.sendPhoneNotification(NotificationType.EMAIL,NetworkType.JIO));
            System.out.println(PhoneFactory.sendPhoneNotification(NotificationType.PUSH,NetworkType.AIRTEL));
        }

}
