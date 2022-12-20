package Lab6;

public class Tarif {
    private final int price;
    private final String name;
    private final int internet;
    private final int minutes;
    private final String program;
    private final int users;

    public Tarif(String name,int price,int internet,int minutes,String program,int users){
        this.price = price;
        this.name = name;
        this.internet = internet;
        this.minutes = minutes;
        this.program = program;
        this.users = users;
    }
    public int getPrice(){
        return price;
    }
    public int getInternet(){
        return internet;
    }
    public String getName(){ return name; }
    public int getMinutes(){
        return minutes;
    }
    public String getProgram(){
        return program;
    }
    public int getUsers(){
        return users;
    }
}
