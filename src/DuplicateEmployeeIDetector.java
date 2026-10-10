import java.util.*;

public class DuplicateEmployeeIDetector {
	public static List<Integer> findDuplicateIds(int[] employeeIds){
		Set<Integer> seen= new HashSet<>();
		Set<Integer> duplicates= new LinkedHashSet<>();
		
		for(int id: employeeIds) {
			if(!seen.add(id)) {
				duplicates.add(id);
			}
		}
		return new ArrayList<>(duplicates);
	}

	public static void main(String[] args) {
		int[] employeeIds= {1001,1002,1003,1002,1004,1001,1005};
		List<Integer>duplicates=findDuplicateIds(employeeIds);
		if(duplicates.isEmpty()) {
			System.out.println("NO duplicate employeee IDs found.");
		}else{
					System.out.println("Duplicate employee IDs detected;"+duplicates);
				}
	}

}
