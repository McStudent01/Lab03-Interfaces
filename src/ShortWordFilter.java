import java.util.ArrayList;
import java.util.List;

public class ShortWordFilter implements Filter
{
    @Override
    public boolean accept(Object x)
    {
        if (x instanceof String)
        {
            String line = (String) x;
            String[] words = line.split("\\s+");
            List<String> shortWords = new ArrayList<>();

            for (String word : words)
            {
                if (word.trim().length() < 5)
                {
                    shortWords.add(word.trim());
                }
            }

            if (!shortWords.isEmpty())
            {
                System.out.println("Short words in the line:");
                for (String word : shortWords)
                {
                    System.out.println(word);
                }
                return true;
            }
        }
        return false;
    }
}
