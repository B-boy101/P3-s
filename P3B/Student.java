public class Student{
    private String firstName;
    private String lastName;
    private int grade;
    private double[] gpa;
   
    public Student(){
        firstName = " ";
        lastName = " ";
        grade = 0;
        gpa = new double[5];
        for (int i = 0; i < gpa.length; i++){
            gpa[i] = 0.0;
        }
        
        
    }// end zero-arg constructor
   
    public Student(String firstName, String lastName, int grade, double english, double math, double science, double art, double history){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        
        gpa = new double[5];
        gpa[0] = english;
        gpa[1] = math;
        gpa[2] = science;
        gpa[3] = art;
        gpa[4] = history;
        
        
        
    }// end multi-arg constructor
   
    public double calcGPA(){
        double total = 0.0;
        for (int i = 0; i < gpa.length; i++){
            total += gpa[i];
        }
        return total/gpa.length;
        
    }
    double getMath(){
        return gpa[1];
    }
    
    public void setMath(double math){
        gpa[1] = math;
    }
    
    public String toString(){
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nGrade: " + grade + "\nGPA: " + calcGPA();
        
    }// end method twoString
    
}// end class Student