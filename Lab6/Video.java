package Lab6;

public class Video extends Tarif{
    public Video(String name,int price, int internet, int minutes, String program, int users) {
        super(name, price, internet, minutes, program, users);
    }
    @Override
    public String toString(){
        return "Відео тариф -- Name: "+ this.getName()+" Price: "+this.getPrice()+" Internet: "+this.getInternet()+
                " Minutes: " +getMinutes()+ " Program: "+getProgram()+" Users: "+getUsers();
    }
}
