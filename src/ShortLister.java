import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ShortLister
{
    public static void main(String[] args)
    {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                List<String> words = Files.readAllLines(selectedFile.toPath());
                Filter shortWordFilter = new ShortWordFilter();
                List<String> shortWords = ListFilterUtil.collectAll(words, shortWordFilter);

                System.out.println("Short words in the file:");
                for (String word : shortWords)
                {
                    System.out.println(word);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
