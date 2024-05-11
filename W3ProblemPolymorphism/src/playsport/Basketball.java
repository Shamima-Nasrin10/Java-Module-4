
package playsport;

public class Basketball extends Sports{
    private String message;

    public Basketball() {
    }

    public Basketball(String message) {
        this.message = message;
    }

    @Override
    public String play() {
        this.message="I like basketball.";
        return message;
    }
}
