package utilities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void myWriteToCSV(List<String> stringList, String outputLocation, boolean append) {
        try (FileWriter fileWriter = new FileWriter(outputLocation, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);)
        {
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> myReadFromCSV(String fileLocation) {
        List<String> result = new ArrayList<>();

        try (FileReader fileReader = new FileReader(fileLocation);
             BufferedReader bufferedReader = new BufferedReader(fileReader);)
        {
            String pointer = "";
            while((pointer = bufferedReader.readLine()) != null) {
                result.add(pointer);
            }

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
