public class passwordEncryptor {
    String password = "";
   public passwordEncryptor(String passwordIn){
       password = passwordIn;
       String encPassword = "";
       if (password.length() % 2 == 0){
           for (int i = 0; i < password.length(); i+=2){
               encPassword += password.substring(i+1,i+2);
               encPassword += password.substring(i,i+1);
               System.out.println(encPassword);
           }
       } else {
           for (int i = 0; i < password.length(); i+=2){
               if (i == 0) {
                   encPassword = password.substring(password.length() - 1);
               }
               if (encPassword.length() < password.length()) {
                   encPassword += password.substring(i + 1, i + 2);
                   encPassword += password.substring(i, i + 1);
               }
               System.out.println(encPassword);
           }
       }

   }




}

