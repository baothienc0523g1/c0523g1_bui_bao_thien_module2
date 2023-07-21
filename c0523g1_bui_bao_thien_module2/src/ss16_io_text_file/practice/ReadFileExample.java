package ss16_io_text_file.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Enter the link of folder contain file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
        /* D:\GIT - Bai tap\c0523g1_bui_bao_thien_module2\src\ss16_io_text_file\practice\test.txt */
    }
    public void readFileText(String filePath) {
        try {
            //đọc file theo đường dẫn
            File file = new File(filePath);

            //kiểm tra xem file tồn tại không
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            //đọc từng dọc bằng BufferedReader và cộng tổng
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.print(line + ", ");
                sum += Integer.parseInt(line);
            }
            //sau khi đọc xong thì đóng file
            br.close();

            //hiển thị tổng các số nguyên
            System.out.println("Sum = " + sum);

        } catch (Exception e) {
            System.out.println("File doesn't exists or wrong syntax of text");
        }
    }
}
