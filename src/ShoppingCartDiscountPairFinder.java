import java.util.*;

public class ShoppingCartDiscountPairFinder {
	public static int[] findPairForBundlePrice(double[] prices,double targetTotal){
		Map<Double,Integer> priceToIndex=new HashMap<>();
		
			for(int i=0;i<prices.length;i++) {
				double complement= targetTotal-prices[i];
				if(priceToIndex.containsKey(complement)) {
					return new int[] {priceToIndex.get(complement),i};
				}
				priceToIndex.put(prices[i],i);
				
			}
			return new int[] {-1,-1};
	}
		public static void main(String[] args) {
			double[] prices= {19,99,5,50,12,25,7,75,30,01};
			double targetTotal=20.00;
			int[] result=findPairForBundlePrice(prices,targetTotal);
			if(result[0]!= -1) {
				System.out.printf("Bundle match: item at index %d ($%.2f) + item at index %d($%.2f)=$%.2f",
						result[0],prices[result[0]],result[1],prices[result[1]],targetTotal);
			} else {
				System.out.println("No matching bundle pair found.");
			}
			}
				
			
		}