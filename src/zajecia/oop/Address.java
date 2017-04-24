package zajecia.oop;

/**
 * Created by RENT on 2017-04-24.
 */
public class Address {
    public String city;
    public String street;
    public int flatNumber;
    public String postalCode;
    public String land;

    public void display(){
        System.out.print("Your adres is: "+city+" "+street+ " "+ flatNumber+" "+ postalCode+" "+ land);
    }

}
