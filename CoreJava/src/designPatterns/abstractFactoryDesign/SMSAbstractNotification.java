package designPatterns.abstractFactoryDesign;

class SMSAbstractNotification extends NotificationAbstractService {

    private final String networkType;

    //It is called no Argument Construtor - When calls loads, this contructor is called
    SMSAbstractNotification(NetworkType type){
        //Super key calls abstractFactoryDesign.NotificationAbstractService's contructor with 1 Enum input
        super(NotificationType.SMS,type);
        networkType = type.toString();
        //This method call in turn calls the below method in line number 11
        constructNotification();
    }

    @Override
    protected void constructNotification()
    {
        // TODO Auto-generated method stub
        System.out.println("constructNotification method - Sending a SMS notification in "+ networkType);
    }
}
