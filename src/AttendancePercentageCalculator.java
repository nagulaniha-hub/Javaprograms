
public class AttendancePercentageCalculator {
	public static double calculateAttendancePercentage(boolean[] attendanceRecord) {
		int presentDays=0;
		for(boolean present:attendanceRecord) {
			if(present) {
				presentDays++;
				
			}
		}
		return (presentDays*100.0)/attendanceRecord.length;
	}

	public static void main(String[] args) {
		boolean[] attendanceRecord= {true,true,false,true,true,true,false,true,true,true};
		double percentage= calculateAttendancePercentage(attendanceRecord);
		System.out.printf("Attendance:%.2f%%%n",percentage);
		if(percentage<75.0) {
			System.out.println("Warning: Attendance below the required 75% threshold");
		} else {
			System.out.println("Attendance requirement met.");
		}
		

	}

}
