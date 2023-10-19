package designPatterns.abstractFactoryDesign;

public abstract class NotificationAbstractService {

    public final NotificationType notify;
    public final NetworkType network;

    //contructor
    NotificationAbstractService(NotificationType notify, NetworkType network){
        this.notify = notify;
        this.network = network;
    }

    // method which needs to be over-ridden in Classes looking for inputs from factory class
    abstract void constructNotification();

    //another way to print via string Object instead of sysout
    @Override
    public String toString()
    {
        return "NotificationAbstractService delivering Notification - "+notify+ " from network - "+ network ;
    }

}
