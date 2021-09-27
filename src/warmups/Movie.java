package warmups;

public class Movie implements Entertains{

    private String name;
    private String director;

    public Movie(){}

    public Movie(String name, String director) throws IllegalArgumentException {

        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String audienceReaction() {
        return "oooooooh " + name + " was so awesome.";
    }







}
