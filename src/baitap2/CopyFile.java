package baitap2;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) {
        String sourceFileName = "source.txt";
        String targetFileName = "target.txt";

        try {

            FileInputStream sourceStream = new FileInputStream(sourceFileName);


            File targetFile = new File(targetFileName);
            if (targetFile.exists()) {
                System.out.println("Tệp đích đã tồn tại. Vui lòng chọn tên khác.");
                return;
            }


            FileOutputStream targetStream = new FileOutputStream(targetFileName);


            int bytesRead;
            byte[] buffer = new byte[1024];
            while ((bytesRead = sourceStream.read(buffer)) != -1) {
                targetStream.write(buffer, 0, bytesRead);
            }


            sourceStream.close();
            targetStream.close();

            System.out.println("Sao chép thành công.");
        } catch (FileNotFoundException e) {
            System.out.println("Tệp nguồn không tồn tại.");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc hoặc ghi tệp.");
        }
    }
}
