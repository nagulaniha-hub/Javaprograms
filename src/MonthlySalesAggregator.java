import java.util.*; /** * Real-world use case: E-commerce dashboards aggregate daily transaction * amounts into monthly totals for financial reporting. */
public class MonthlySalesAggregator {    public static double[] aggregateMonthlySales(double[] dailySales, int[] monthOfEachDay, int numberOfMonths) {       
	double[] monthlyTotals = new double[numberOfMonths];
	for (int i = 0; i < dailySales.length; i++) {
		int month = monthOfEachDay[i] - 1;
		// month index is 0-based 
		monthlyTotals[month] += dailySales[i];
		}
	    return monthlyTotals;
	    }
public static void main(String[] args) {
	double[] dailySales = {250.0, 300.5, 120.0, 400.0, 275.25, 90.0};
	int[] monthOfEachDay = {1, 1, 1, 2, 2, 3};
	
double[] monthlyTotals = aggregateMonthlySales(dailySales, monthOfEachDay, 3);
for (int i = 0; i < monthlyTotals.length; i++) {            
System.out.printf("Month %d total sales: $%.2f%n", (i + 1), monthlyTotals[i]);        }    } }
