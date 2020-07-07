/**
 *
 * @author Aidan Glas
 */
public class FootballPlayer extends Player
{
    private String college;
    private int weight;

    public FootballPlayer(String c, int w) {
        this.college = c;
        this.weight = w;
    }

    public FootballPlayer() 
    {
        this.college = "";
        this.weight = 0;
    }

    public double getRatings()
    {
        return 0.0;
    }
    
    @Override
    public String toString() {
        return "FootballPlayer{" + "college=" + college + ", weight=" + weight + '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    
    
}
