public class RegexValidatePINCode {

//    public static boolean validatePin(String pin) {
//        return pin.matches("\\d{4}|\\d{6}");
//    }

    public static boolean validatePin(String pin) {
        // Your code here...
       boolean isOnlyDigit = true;
       if(pin.length() != 6 && pin.length() != 4){
           return false;
       }

        for (int i = 0; i < pin.length() && isOnlyDigit; i++) {
            if(!Character.isDigit(pin.charAt(i))){
                isOnlyDigit = false;
                return isOnlyDigit;
            }
        }
        return isOnlyDigit;
    }
}
