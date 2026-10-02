public class Main{
    public static void main(String[] args){
        String school1 = new String ("Stanford");
        String school2 = new String ("Oregon");
        String school3 = new String ("UCLA");

        System.out.println(school1.compareTo(school2));

        /*
           The compareTo() method tells us which String comes first
           alphabetically. A negative number means the first String
           comes before the second, 0 means they are equal, and a
           positive number means the first String comes after the second.

           If two schools have the same first letter but different
           second letters, compareTo() compares the second letters.
           The school with the letter that comes first alphabetically
           will have the smaller value.

           It compares with the Unicode values
           C = 67
           S = 83
           67 - 83 = -16
           Example ^^^
        */

    }
}