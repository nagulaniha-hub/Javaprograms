class Student{
	int rollNum, mark1,mark2,mark3,totalMarks;
	String studName;
	void setStudDetails(int rollNum,String studName,int mark1,int mark2,int mark3) {
		this.rollNum=rollNum;
		this.studName=studName;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	void calculatorTotal() {
		totalMarks=mark1+mark2+mark3;
	}
	void displayStudDetails() {
		System.out.println("Roll No: "+rollNum+" Name: "+studName+" Total Marks:"+totalMarks);
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Student s1=new Student();
			s1.setStudDetails(123, "ALice", 31, 25, 27);
			s1.calculatorTotal();
			s1.displayStudDetails();
					
		}

	}


