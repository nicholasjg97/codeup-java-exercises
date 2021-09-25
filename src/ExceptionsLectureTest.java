public class ExceptionsLectureTest {

    public static void main(String[] args) {

        ExceptionsLecture el = new ExceptionsLecture();
        System.out.println(Integer.parseInt(el.couldBeAnInteger));

//        try {
//            ExceptionsLecture el = new ExceptionsLecture();
//            System.out.println(Integer.parseInt(el.certainlyNotAnInteger));
//        } catch (NumberFormatException nfe) {
////            System.out.println("Got an exception " + nfe);
////            System.out.println(nfe.getMessage());
//            nfe.printStackTrace();
//        }


//        try {
//            String testString = "This is a string";
//            System.out.println(testString.length());
//            System.out.println(testString.substring(-5));
//        } catch (IndexOutOfBoundsException ioobe) {
//            System.out.println("Whoa dude, out of bounds!");
//        }


//        el.askForAnInteger();
//        el.aMoreComplexAskForInteger();
//        el.subListMaker("Let's go ahead and work with this sentence, shallll we?");
//        try {
//            el.echoWord();
//        } catch (IllegalArgumentException iax) {
//            System.out.println("How rude!");
//        }

        try {
            el.echoWord();
        } catch (CusswordException cx) {
            System.out.println(cx.getMessage());
        }

        Lizard lizard = new Lizard("lizard");
        try {
            Lizard illegalLizard = new Lizard("      ");
        } catch (IllegalArgumentException iax) {
            System.out.println("That is an illegal lizard, siiirrr. Going to have to take you in!");
        }








    }


}
