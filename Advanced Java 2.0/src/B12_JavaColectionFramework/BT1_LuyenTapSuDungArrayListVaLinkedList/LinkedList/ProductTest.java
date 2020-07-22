package B12_JavaColectionFramework.BT1_LuyenTapSuDungArrayListVaLinkedList.LinkedList;

import java.util.Collections;

public class ProductTest {
    public static void main(String[] args) {
        ProductManager pManager = new ProductManager();
        pManager.addProduct(new Product(24, "Sam sung", 4500));
        pManager.addProduct(new Product(3, "Nokia", 1000));
        pManager.addProduct(new Product(6, "Xiaomi", 5500));
        pManager.addProduct(new Product(123, "Iphone", 20500));
        pManager.addProduct(new Product(9, "Meizu", 5000));
        pManager.addProduct(new Product(50, "Realme", 3500));

        pManager.displayListProduct();
        pManager.removeProduct(123);
        pManager.displayListProduct();

        System.out.println("Search product 'Meizu': ");
        System.out.println(pManager.findProductByName("Meizu"));

        System.out.println("Sort product by cost: ");
        ProductComparator productComparator = new ProductComparator();

        Collections.sort(pManager.getListOfProducts(), productComparator);
        pManager.displayListProduct();

        System.out.println("Sort product by name: ");

        Collections.sort(pManager.getListOfProducts());
        pManager.displayListProduct();

        System.out.println("Edit product:");
        pManager.editProduct(3);
        pManager.displayListProduct();
    }
}
