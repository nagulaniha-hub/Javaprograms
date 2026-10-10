import java.util.*;
	
public class InventoryReorderAlert {
	static class Product{
		String name;
		int quantityInStock;
		int reorderThreshold;
		
		
		Product(String name,int quantityInStock,int recordreThreshold){
			this.name=name;
			this.quantityInStock=quantityInStock;
			 this.reorderThreshold = reorderThreshold;
			 
		}
	}
	public static List<String> findProductToReorder(Product[] inventory){
		List<String> reorderList=new ArrayList<>();
		for(Product p:inventory) {
			if(p.quantityInStock<=p.reorderThreshold) {
				reorderList.add(p.name + " (in stock: " + p.quantityInStock+",threshold:"+p.reorderThreshold+")");
			}
		}
		return reorderList;
		}
	public static void main(String[] args) {
		Product[] inventory= {
				new Product("USB-C Cable",12,20),
				new Product("Wireless Mouse",45,15),
				new Product("Laptop Stand",3,10),
				new Product("HDMI Adapter",8,8)
		};
		List<String>toReorder=findProductToReorder(inventory);
		System.out.println("Products that need reordering");
		for (String item:toReorder) {
			System.out.println("-"+item);
		}
	}
}