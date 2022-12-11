import java.io.File;
import java.util.ArrayList;

public class Main implements FileOps {

    public ArrayList<Story> stories = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void addStory() {
        String title = "";
        int totalChapters;
        ArrayList<String> genres = new ArrayList<>();

        stories.add(new Story(title, totalChapters, genres));

    }

    public void addToFile() {
        File file = new File("stories.txt");
    }
}
