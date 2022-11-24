package Com.Inetbanking.testData;


public class Student 
{    private int sno; //AM only access inside the class
	 private String sname;
     
	 
	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getSname() {
		return sname;
	}


	public static void main(String[] args) {
    Student s=new Student();
    System.out.println(s.sno);
    System.out.println(s.sname);
	}

}
