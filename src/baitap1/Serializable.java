package baitap1;

import java.io.*;
import java.util.List;

public class Serializable {

    public static final String FILENAME = "product.txt";

    public static void serializeProducts(List<Product> products) {
        File file = new File(FILENAME);
        FileOutputStream fileOutputStream;
        ObjectOutputStream outputStream ;

        try {
            fileOutputStream = new FileOutputStream(file);
            outputStream = new ObjectOutputStream(fileOutputStream);

            for (Product product : products) {
                outputStream.writeObject(product);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}





