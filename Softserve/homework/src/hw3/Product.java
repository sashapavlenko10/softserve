package hw3;

public class Product {
private String name;
private int price;
private int quantity; 
public Product(String name,int price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
public Product() {}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setAge(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
}
public static void equal(int a, int b, int c) {
	if(a>b&&a>c){
		System.out.println("bred= " + a);
	}
	else  if (b>a&&b>c){
		System.out.println("milk" + b);
	}
	else {
		System.out.println("water " + c);
	
	}
}
}

