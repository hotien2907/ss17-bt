package baitap1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public  class Deserialization {


    public  static List<Product> DeserializableProduct() {
        List <Product> list = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream("product.txt");
             ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
                list = (List<Product>) inputStream.readObject();

        }catch (EOFException e) {
            System.out.println("qua trinh doc file ket thuc");
        }catch (IOException e) {
            System.out.println("loi xay ra khi doc !!");

        }catch (ClassNotFoundException e) {
            System.out.println("dinh dang du lieu ko phu hop");

        }
        return list;
    }


}
