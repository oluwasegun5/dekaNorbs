package exercises;

public class DaysOfChristmas {
    public static void main(String... args){
        String firstDay = " A partridge in a pear tree\n";
        String secondDay = "Two turtle-doves\n";
        String thirdDay = "Three French hens\n";
        String fourthDay = "Four calling birds\n";
        String fifthDay = "Five golden rings\n";
        String sixthDay = "Six geese a-laying\n";
        String seventhDay = "Seven swans a-swimming\n";
        String eighthDay = "Eight maids a-milking\n";
        String ninthDay = "Nine ladies dancing\n";
        String tenthDay = "Ten lords a-leaping\n";
        String eleventhDay = "Eleven pipers piping\n";
        String twelfthDay = "\nTwelve drummers drumming\n";

        int number =1;
        while (number < 13){

            String days = switch (number) {
                case 1 -> "First";
                case 2 -> "Second";
                case 3 -> "Third";
                case 4 -> "Forth";
                case 5 -> "Fifth";
                case 6 -> "Sixth";
                case 7 -> "Seventh";
                case 8 -> "Eighth";
                case 9 -> "Ninth";
                case 10 -> "Tenth";
                case 11 -> "Eleventh";
                case 12 -> "Twelfth";
                default -> "";
            };
            String event ="";
            switch (days) {
                case "First" -> event = firstDay;
                case "Second" -> event = secondDay +"And"+firstDay;
                case "Third" -> event = thirdDay + secondDay +"And"+firstDay;
                case "Forth" -> event = fourthDay + thirdDay + secondDay +"And"+firstDay;
                case "Fifth" -> event = fifthDay + fourthDay + thirdDay + secondDay +"And"+firstDay;
                case "Sixth" -> event = sixthDay + fifthDay + fourthDay + thirdDay + secondDay +"And"+firstDay;
                case "Seventh" -> event = seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay +"And"+firstDay;
                case "Eighth" -> event = eighthDay + seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay +"And"+firstDay;
                case "Ninth" -> event = ninthDay + eighthDay + seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay +"And"+firstDay;
                case "Tenth" -> event = tenthDay + ninthDay + eighthDay + seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay +"And"+firstDay;
                case "Eleventh" -> event = eleventhDay + tenthDay + ninthDay + eighthDay + seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay +"And"+firstDay;
                case "Twelfth" -> event = twelfthDay + eleventhDay + tenthDay + ninthDay + eighthDay + seventhDay + sixthDay + fifthDay + fourthDay + thirdDay + secondDay +"And"+firstDay;
            }

            System.out.printf("On the %s day of christmas my true love gave to me %s%n%n",days,event);
            number++;
        }
    }
}
