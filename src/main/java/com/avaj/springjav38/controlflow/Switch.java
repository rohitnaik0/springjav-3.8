package com.avaj.springjav38.controlflow;

public class Switch {
    public static void main(String[] args) {


            int switchValue = 5;
//
//            switch(switchValue){
//                case 1 :
//                    System.out.println("Value is 1");
//                    break;
//                case 2 :
//                    System.out.println("Value is 2");
//                    break;
//                case 3: case 4: case 5:
//                    System.out.println("Value was either of 3/4/5");
//                    System.out.println("The value was"+ switchValue+switchValue);
//                    break;
//                default :
//                    System.out.println("Neither 1 nor 2");
//                    break;
//            }

        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> {
                System.out.println("Value was either of 3/4/5");
                System.out.println("The value was" + (switchValue + switchValue));
            }
            default -> System.out.println("Neither 1 nor 2");
        }

        String month = "XYQY";
        System.out.println(month+" is in the "+ getQuarter(month)+" quarter");

    }

    public static String getQuarter(String month){
//        switch (month){
//            case "January": case "February": case "March":
//                return "1st";
//            case "April": case "May": case "June":
//                return "2nd";
//            case "July": case "August": case "September":
//                return "3rd";
//            case "October": case "November": case "December":
//                return "4th";
//        }
//        return "bad";

        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badresponse = month + " is bad";
                yield badresponse;
            }
        };

    }

}

