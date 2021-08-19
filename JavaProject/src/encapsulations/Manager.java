package encapsulations;

public class Manager {

	
	
	private int age;
	private double salary;
	private String fullname;

	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary<=1000) {
			
		this.salary = salary;
		
			}
			else {
				System.out.println("unknown salary");
			}
			}
			
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
