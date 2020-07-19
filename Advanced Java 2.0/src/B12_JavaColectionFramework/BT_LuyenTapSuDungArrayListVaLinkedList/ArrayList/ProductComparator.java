package B12_JavaColectionFramework.BT_LuyenTapSuDungArrayListVaLinkedList.ArrayList;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {

        if (o1.getCost() > o2.getCost()) {
            return 1;
        } else if (o1.getCost() == o2.getCost()) {
            return 0;
        } else {
            return -1;
        }
    }
}
