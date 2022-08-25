
package mycarinfo;

public class mycarinformation
{
    private final String RegistrationNo;
    private int speed;

    public Vehicle(String make, int speed) {
        this.speed = ;
        this.RegistrationNo= RegistrationNo;
    }

    public void accelerate() {
        speed++;
    }

    public String getPrice() {
        return Price;
    }

    public int getRegistrationNo.() {
        return RegistrationNo;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return  String.format(
            "Make: %s\nSpeed: %d", getRegistrationNo(), getSpeed());
    }
}
