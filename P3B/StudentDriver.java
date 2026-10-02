public class StudentDriver{
    public static void main(String[] args){
        
        Student senior001 = new Student();
        System.out.println(senior001.toString());
       
        Student frosh001 = new Student("Iva", "Stuart", 9, 3.3, 2.0, 2.7, 4.0, 4.0);
        System.out.println(frosh001.toString());
        frosh001.setMath(3.7);
        System.out.println(frosh001.calcGPA());
        
    }// end method main
}// end class StudentDriver