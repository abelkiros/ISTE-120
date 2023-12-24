import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {

    public static void main(String[] args) {

        if (args.length == 0 || args[0] == null) {
            System.out.println("Enter input file name from command line argument as 1st argument");
            return;
        }

        FileReader reader = null;
        FileWriter writer = null;
        char[] contents = null;

        try {
            File file = new File(args[0]);
            contents = new char[(int) file.length()];
            reader = new FileReader(file);
            reader.read(contents);

            if (args.length == 1)
                writer = new FileWriter("testCopied.txt");
            else if (args.length == 2 || args[2] == "a")
                writer = new FileWriter(args[1], true);
            else
                writer = new FileWriter(args[1]);

            writer.write(contents);

            reader.close();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found");
        } catch (IOException e) {
            System.out.println("Exception occur in writing to the output file");
        }
    }
}