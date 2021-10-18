import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCount {

    public int getWordCount(File[] filename) throws FileNotFoundException {
        Scanner sc = null;
        String input;
        int count = 0;

        for(File file : filename)
        {
            sc = new Scanner(file);

            while (sc.hasNextLine())
            {
                input = sc.nextLine();
                String words[] = input.split(" ");
                count = count+ words.length;
            }
        }
        return count;

    }
    public int getDistinctWordCount(File[] filename)throws FileNotFoundException{
        HashSet<String> wordList1=new HashSet();

        Scanner sc = null;
        String input;
        int count = 0;

        for(File file : filename)
        {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                input = sc.nextLine();
                StringTokenizer st = new StringTokenizer(input, " ");
                while(st.hasMoreTokens())
                {
                    String tmp = st.nextToken();
                    wordList1.add(tmp);
                }
            }
        }
        for (int j=0;j< wordList1.size();j++)
        {
            count = count+1;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {

        int count1;
        File path = new File("/home/priyab/Downloads/AssignmentWeek5/FileDirectory");
        File filesList[] = path.listFiles();

        WordCount wc = new WordCount();

        count1 = wc.getWordCount(filesList);
        System.out.println("\n Total words count in directory: "+ count1);

        count1 = wc.getDistinctWordCount(filesList);
        System.out.println("\n Distinct words count in directory: "+ count1);


    }
}
