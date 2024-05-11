
package playsport;

public class Rugby extends Sports{
    
    private String message;

    public Rugby() {
    }

    public Rugby(String message) {
        this.message = message;
    }

    @Override
    public String play() {
        this.message="I like rugby.";
        return message;
    }
    
}
