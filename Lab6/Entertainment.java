package Lab6;

public class Entertainment extends Tarif{
    public Entertainment(String name,int price, int internet, int minutes, String program, int users) {
        super(name, price, internet, minutes, program, users);
    }
    @Override
    public String toString(){
        return "Розважальний тариф -- Name: "+ this.getName()+" Price: "+this.getPrice()+" Internet: "+this.getInternet()+
                " Minutes: " +getMinutes()+ " Program: "+getProgram()+" Users: "+getUsers();
    }
}
