package OOPS;

public class College {
    private String CollegeName;
    private String StudentName;
    private String StudentAddress;
    private String CollegeAddress;
    private int roll_no;
    private String Course;
    private String Branch;
    College(){
        this.CollegeName = "IMS Engineering College";
        this.CollegeAddress  = "Daasna, Ghaziabad";
        System.out.println("College Name:" + CollegeName);
        System.out.println("Address:" + CollegeAddress);
    }

    public void SetStudentPersonalDetails(String StudentName,String StudentAddress){
        this.StudentName = StudentName;
        this.StudentAddress = StudentAddress;
    }

    public void setStudentCollegeDetails(int roll_no,String Course,String Branch){
        this.Course = Course;
        this.Branch = Branch;
        this.roll_no = roll_no;
    }

    public void StudentDetail(){
        System.out.println("Name:" + StudentName);
        System.out.println("Address:"+ StudentAddress);
        System.out.println("Roll No.:" + roll_no);
        System.out.println("Course:" + Course);
        System.out.println("Branch:" + Branch);
    }
}
