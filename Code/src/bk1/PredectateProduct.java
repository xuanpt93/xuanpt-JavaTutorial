package bk1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredectateProduct {

    public static List<Product> data = new ArrayList<>();

    public List<Product> where(Predicate<Product> predicate){
        List<Product> sreach = new ArrayList<>();
        for (Product prd: data){
            if(predicate.test(prd)){
                sreach.add(prd);
            }
        }
        return sreach;
    }
}
