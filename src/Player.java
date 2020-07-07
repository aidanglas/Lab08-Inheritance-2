/**
 *
 * @author Aidan Glas
 */
public class Player 
{
    private String name;
    private String sports;
    private int number;

    public Player(String na, String s, int nu) 
    {
        this.name = na;
        this.sports = s;
        this.number = nu;
    }
    
    public Player() 
    {
        this.name = "";
        this.sports = "";
        this.number = 0;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", sports=" + sports + ", number=" + number + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
