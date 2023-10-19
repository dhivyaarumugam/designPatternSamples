package designPatterns.abstractFactoryDesign;

class EmailAbstractNotification extends NotificationAbstractService {

    private final String networkType;

    //It is called no Argument Construtor - When calls loads, this contructor is called
    EmailAbstractNotification(NetworkType type){
        //Super key calls abstractFactoryDesign.NotificationAbstractService's contructor with 1 Enum input
        super(NotificationType.EMAIL, type);
        networkType = type.toString();
        //This method call in turn calls the below method in line number 17
        constructNotification();
    }

    @Override
    protected void constructNotification()
    {
        // TODO Auto-generated method stub
        System.out.println("constructNotification method - Sending a Email notification in "+  networkType);
    }
}
