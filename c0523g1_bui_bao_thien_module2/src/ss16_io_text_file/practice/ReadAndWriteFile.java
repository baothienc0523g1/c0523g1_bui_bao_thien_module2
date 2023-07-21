package ss16_io_text_file.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.read("D:\\GIT - Bai tap\\c0523g1_bui_bao_thien_module2\\src\\ss16_io_text_file\\practice\\test.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.write("D:\\GIT - Bai tap\\c0523g1_bui_bao_thien_module2\\src\\ss16_io_text_file\\practice\\result.txt",maxValue);
    }
    /*line 9: tạo đối tượng readAndWriteFile từ class để gọi các phương thức
    * line 10: Tạo list<integer> numbers bằng phương thức write của readAndWriteFile-> các số trong file sẽ đc ghi vào number
    * line 11: gọi phương thức tìm max trong mảng numbers
    * line 12: viết 1 file dạng txt vào đường dẫn bằng phương thức write của readAndWriteFile*/
    public List<Integer> read(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if(!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();

        }catch (Exception e) {
            System.out.println("Wrong location of file or invalid syntax element");
        };
        return numbers;
    }
    public void write(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("The max value is: " + max);
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static int findMax(List<Integer> integers) {
        int max = integers.get(0);
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) > max) {
                max = integers.get(i);
            }
        }
        return max;
    }
}
