package designPatterns.abstractFactoryDesign;

class PushAbstractNotification extends NotificationAbstractService {

    String networkType = null;
    //It is called no Argument Construtor - When calls loads, this contructor is called
    PushAbstractNotification(NetworkType type){
        //Super key calls abstractFactoryDesign.NotificationAbstractService's contructor with 1 Enum input
        super(NotificationType.PUSH, type);
        networkType = type.toString();
        //This method call in turn calls the below method in line number 11
        constructNotification();
    }

    @Override
    protected void constructNotification()
    {
        // TODO Auto-generated method stub
        System.out.println("constructNotification method - Sending a push notification from "+ networkType);
    }
}
