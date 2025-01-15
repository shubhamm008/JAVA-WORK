public class student_class 
{
    private String name;
    int empid=500;
    double salary=90000;
    public 
    void setData(String name, int i, double j)
    {
        if(i>=1000 && i<=2000)
        {
            this.empid=i;
        }
        else
        {
            System.out.println("Invalid emp id ");
        }
        if(j>=50000 && j<=100000)
        {
            this.salary=j;
        }
        else
        {
            System.out.println("Invalid salary");
        }
        this.name=name;
    }
    void getData()
    {
        System.out.println("Name of the employee is : " +  name);
        System.out.println("Emp id of the employee is : " + empid);
        System.out.println("The salary of the employee is: "+ salary);
    }
   
    public static void main(String[] args) 
    {
        student_class s1=new student_class();
        s1.setData("Shubham", 2300, 100000);
        s1.getData();
    }
}
