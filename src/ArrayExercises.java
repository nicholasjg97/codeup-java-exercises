import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        // Created array that holds 3 person objects
        Person[] person = new Person[3];

        // Assign a new instance of person class to each element
        person[0] = new Person("Joe");
        person[1] = new Person("Ace");
        person[2] = new Person("Jean-Michel");

        // iterate through the array and print out the name of each person
        for (Person individualPerson : person) {
            System.out.println(individualPerson.getName());
        }



    }

    public static Person[] addPerson(Person[] peopleArray, Person newPerson) {
        Person[] newPeopleArray = Arrays.copyOf(peopleArray, peopleArray.length + 1);

        newPeopleArray[newPeopleArray.length - 1] = newPerson;

        return newPeopleArray;
    }

}
