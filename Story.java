import java.util.ArrayList;
import java.util.Map;

public class Story {
    private ArrayList<String> genres = new ArrayList<>();
    //private Map<Person, String> characters;
    private ArrayList<Person> authors = new ArrayList<>();
    private ArrayList<Person> editors = new ArrayList<>();
    private ArrayList<Person> contributors = new ArrayList<>();
    private String title;
    private int totalChapters;

    public Story(ArrayList<String> genres, Map<Person, String> characters,
                 ArrayList<Person> authors, ArrayList<Person> editors,
                 ArrayList<Person> contributors, String title, int totalChapters) {
        this.genres = genres;
        //this.characters = characters;
        this.authors = authors;
        this.editors = editors;
        this.contributors = contributors;
        this.title = title;
        this.totalChapters = totalChapters;
    }

    public ArrayList<String> addGenres() {

    }

    public ArrayList<String> addCharacters() {

    }
}
