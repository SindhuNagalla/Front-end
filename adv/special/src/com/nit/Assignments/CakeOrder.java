package com.nit.Assignments;

class Cake
{
	private String shape;
	private String flavor;
	private int quantity;
	private double price;
	
	public Cake(String shape, String flavor, int quantity) 
	{
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String toString()
	{
		return shape+flavor+quantity+price;
	}
}

class OrderedCake extends Cake
{
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	OrderedCake(String shape,String flavor,int quantity)
	{
		super(shape,flavor,quantity);
	}
	
	OrderedCake(String shape,String flavor,int quantity,String message)
	{
		super(shape,flavor,quantity);
		this.message=message;
	}
	
//	public String toString()
//	{
//		return shape+flavor+quantity+message+price;
//	}
}
public class CakeOrder 
{
	public static void main(String[] args)
	{
		Cake c=new Cake("Round","Vanila",1);
		c.setPrice(400);
		System.out.println("A"+" "+c.getShape()+" "+c.getFlavor()+" "+"Cake Of"+" "+c.getQuantity()+" KG is Ready@ "+c.getPrice());
		
		Cake c1=new Cake("Round","Choclate",4);
		c1.setPrice(1600);
		System.out.println("A"+" "+c1.getShape()+" "+c1.getFlavor()+" "+"Cake Of"+" "+c1.getQuantity()+" KG is Ready @ "+c1.getPrice());
		
		OrderedCake c2=new OrderedCake("Square","pineapple",3," KG is Ready with Happy Birthday Message");
		c2.setPrice(1200.0);
		System.out.println("A"+" "+c2.getShape()+" "+c2.getFlavor()+" "+"Cake Of"+" "+c2.getQuantity()+" "+c2.getMessage()+" "+c2.getPrice());
	}

}
