package bk1;

import java.util.List;

public class Product {
    String name ;
    int price;
    String author;

    public Product() {
    }

    public Product(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(!(o instanceof Product)){
            return false;
        }
        return name != null && name.equals(((Product) o).name);
//        return price == product.price && com.google.common.base.Objects.equal(name, product.name) && com.google.common.base.Objects.equal(author, product.author);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(null);
    }
}
