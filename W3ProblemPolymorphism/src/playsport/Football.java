
package playsport;

public class Football extends Sports{
    private String message;

    public Football() {
    }

    public Football(String message) {
        this.message = message;
    }

    @Override
    public String play() {
        this.message="I like football.";
        return message;
    }
    
    
}
