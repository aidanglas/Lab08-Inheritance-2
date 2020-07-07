/**
 *
 * @author Aidan Glas
 */
public class QuarterBack extends FootballPlayer
{
    private int completions;
    private int attempts;

    public QuarterBack(int c, int a) 
    {
        this.completions = c;
        this.attempts = a;
    }

    public QuarterBack() 
    {
        this.completions = 0;
        this.attempts = 0;
    }

    @Override
    public double getRatings()
    {
        return (completions/attempts);
    }
    
    @Override
    public String toString() {
        return "QuarterBack{" + "completions=" + completions + ", attempts=" + attempts + '}';
    }

    public int getCompletions() {
        return completions;
    }

    public void setCompletions(int completions) {
        this.completions = completions;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
    
    
}
