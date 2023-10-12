package baitap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import static baitap1.Deserialization.DeserializableProduct;
import static baitap1.Serializable.serializeProducts;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        int choie;

        do {
            System.out.println("-----------------MENU------------------");
            System.out.println("1.Thêm sp");
            System.out.println("2.Hiển thị sp");
            System.out.println("3.Tìm kiếm sp:");
            System.out.println("4.Thoát");
            System.out.println("chọn:");
            choie = Integer.parseInt(scanner.nextLine());
            switch (choie){
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayData();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    serializeProducts(products);
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("lựa chọn ko hợp lệ");
                    break;
            }

        }while (choie !=4);
        products=DeserializableProduct();

    }

    public static void addProduct() {
        Product product = new Product();
        System.out.println("nhập số sp muốn thêm vào");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("sp thứ: " + (i + 1));
            product.inputData();
            products.add(product);

        }
    }
    public  static  void displayData(){
        if(products ==null){
            System.out.println("danh sách sản phẩm rỗng");
        }
        for (Product pr:products
             ) {
            pr.disphay();
            System.out.println("---------");
        }
    }
    public static void searchProduct() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng.");
            return;
        }
        System.out.print("Nhập mã sản phẩm cần tìm kiếm: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (Product pr : products) {
            if (pr.getProductId() == id) {
                pr.disphay();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có mã " + id);
        }
    }


}
