/**
 *
 * @author Aidan Glas
 */
public class RunningBack extends FootballPlayer
{
    private int yards;
    private int touchdowns;
    private int fumbles;

    public RunningBack(int y, int t, int f) 
    {
        this.yards = y;
        this.touchdowns = t;
        this.fumbles = f;
    }

    public RunningBack() 
    {
        this.yards = 0;
        this.touchdowns = 0;
        this.fumbles = 0;
    }

    @Override
    public double getRatings()
    {
        return (touchdowns*yards)/fumbles;
    }
    
    @Override
    public String toString() {
        return "RunningBack{" + "yards=" + yards + ", touchdowns=" + touchdowns + ", fumbles=" + fumbles + '}';
    }

    public int getYards() {
        return yards;
    }

    public void setYards(int yards) {
        this.yards = yards;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }
    
    
}
