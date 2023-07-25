package ss16_io_text_file.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadCsvFile {
    public static void main(String[] args) {
        String inputLink = "D:\\GIT - Bai tap\\c0523g1_bui_bao_thien_module2\\src\\ss16_io_text_file\\exercise\\countries.csv";
        display(myCsvRead(inputLink));

        String obj  = "abcdef";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
    }
    public static List<String> myCsvRead(String filePackage) {
        List<String> output = new LinkedList<>();
        try {
            /*tạo đối tượng từ lớp File trước khi bắt đầu làm gì đó*/
            File file = new File(filePackage);

            /*đọc file bằng bộ nhớ đệm*/
            BufferedReader br = new BufferedReader(new FileReader(file));
            String pointer = "";
            /*đọc file lần lượt*/
            while ((pointer = br.readLine()) != null) {
                output.add(Arrays.toString(pointer.split(" ")));
            }
            /*thực hiện đọc xong -> đóng file*/
            br.close();
        } catch (Exception e) {
            System.out.println("Wrong file link or something wrong, i dont know, how can i know?");
        }
        return output;
    }
    public static void display(List<String> input) {
        for (int i = 0; i < input.size(); i++) {
            System.out.println(input.get(i));
        }
    }
}
