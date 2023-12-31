package ss17_io_binary_file_va_serialization.practice.practice1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Practice1 {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {

        try {
            InputStream is = new FileInputStream(source);
            OutputStream os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            os.close();
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter source file: ");
        String sourcePath = in.nextLine();
        System.out.println("Enter destination file: ");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.println("Copy completed");
        } catch (IOException ioe) {
            System.out.println("Cant copy");
            System.out.println(ioe.getMessage());
        }
        /*D:\GIT - Bai tap\c0523g1_bui_bao_thien_module2\src\ss17_io_binary_file_va_serialization\practice\practice1\practice1_input.txt*/
    }
}
