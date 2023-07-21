package ss16_io_text_file.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public final class CopyTextFile {
    public static void main(String[] args) {
        String inputLink = "D:\\GIT - Bai tap\\c0523g1_bui_bao_thien_module2\\src\\ss16_io_text_file\\exercise\\inputText.txt";
        String outputLink = "D:\\GIT - Bai tap\\c0523g1_bui_bao_thien_module2\\src\\ss16_io_text_file\\exercise\\outputText.txt";

        myCloneMethod(inputLink,outputLink);

    }
    /*đọc file đầu vào*/
    public static List<String> myReadMethod(String filePath) {
        List<String> inputList = new ArrayList<>();

        try {
            /*tạo đối tượng file của lớp tiện ích File để đọc file*/
            File file = new File(filePath);

            /*kiểm tra file có tồn tại không*/
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            /*đọc file bằng bộ nhớ đệm buffer*/
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";

            /* đọc file đến khi kí tự tiếp theo là rỗng*/
            while ((line = br.readLine()) != null) {
                inputList.add(line);
            }
            /*đóng file sau khi đọc xong*/
            br.close();

        } catch (Exception e) {
            System.out.println("Wrong location of file or invalid syntax element");
        }
        return inputList;
    }
    /*copy file đầu vào thành 1 file mới*/
    public static void myCloneMethod(String inputFile,String filePath) {
        /* inputFile là link file cần copy
        filePath là link của file thành quả sau khi copy
         */
       try {
           /*tạo đối tượng write của lớp tiện ích FileWrite để ghi file*/
           FileWriter writer = new FileWriter(filePath, true);

           /*đọc file bằng bộ nhớ đệm BufferedReader*/
           BufferedWriter bw = new BufferedWriter(writer);
           int i = 0;
           while (i < myReadMethod(inputFile).size()) {
               bw.write(myReadMethod(inputFile).get(i));
               i++;
           }
           bw.close();
           System.out.println("Clone " + inputFile + " successfully");
       } catch (IOException ioe) {
           ioe.printStackTrace();
       }
    }
}
