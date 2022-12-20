package Lab6;

public class Communication extends Tarif{

    public Communication(String name,int price, int internet, int minutes, String program, int users) {
        super(name, price, internet, minutes, program, users);
    }
    @Override
    public String toString(){
        return "Комункаційний тариф -- Name: "+ this.getName()+" Price: "+this.getPrice()+" Internet: "+this.getInternet()+
                " Minutes: " +getMinutes()+ " Program: "+getProgram()+" Users: "+getUsers();
    }
}
