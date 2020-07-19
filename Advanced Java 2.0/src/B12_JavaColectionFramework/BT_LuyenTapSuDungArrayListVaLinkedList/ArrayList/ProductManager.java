package B12_JavaColectionFramework.BT_LuyenTapSuDungArrayListVaLinkedList.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> listOfProducts = new ArrayList<Product>();

    public boolean addProduct(Product p) {
        return this.listOfProducts.add(p);
    }

    public void editProduct(int id) {
        Product pEdit = null;

        for (Product p : listOfProducts) {
            if (p.getId() == id) {
                pEdit = p;
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Info product: " + pEdit.toString());
        System.out.println("Input product name: ");
        String productName = scanner.nextLine();
        pEdit.setProductName(productName);
        System.out.println("Input cost: ");
        double cost = scanner.nextDouble();
        pEdit.setCost(cost);
    }

    public void removeProduct(int id) {

        for (Product p : listOfProducts) {
            if (p.getId() == id) {
                listOfProducts.remove(p);
                break;
            }
        }
    }

    public void displayListProduct() {

        System.out.println("------------------------------------");
        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.println("Product[" + i + "]: ");
            System.out.println(this.listOfProducts.get(i).toString());
        }
        System.out.println("------------------------------------");
    }

    public Product findProductByName(String name) {

        for (Product p : listOfProducts) {
            if (p.getProductName().equals(name)) {
                return p;
            }
        }

        return null;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }
}
