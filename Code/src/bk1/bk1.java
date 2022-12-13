package bk1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bk1 {
    public static void main(String[] args) {

        lamda message = new lamda() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);
            }
        };
        message.showMessage("This is a message when using anonymous class.");

        lamda ms = (String mik) ->{
            System.out.println(mik);
        };
        ms.showMessage("theo kieu lamda exprestion");

        List<Product> list = new ArrayList<Product>();

        Product pt = new Product("Sach thanh",1749,"phap su");
        list.add(pt);
        Product pt1 = new Product("Truong bang",4564,"phap su");
        list.add(pt1);
        Product pt2 = new Product("Dao truy hon",543,"giam hoi mau");
        list.add(pt2);
        Product pt3 = new Product("song dao bao tap",980,"ad");
        list.add(pt3);
        System.out.println(list.size());
        for(Product pttt: list){
           Stream<Product> prd = list.stream().filter(product -> product.price == 980);
            prd.forEach(p -> System.out.println(p.toString()));
            break;
        }

//
//        List<Product> productList = pm.where(p -> p.getPrice() > 1000);
//
//        for (Product ll: productList){
//            System.out.println(ll.price);
//        }
    }
}

