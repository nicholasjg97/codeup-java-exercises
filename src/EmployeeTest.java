public class EmployeeTest {

    public static void main(String[] args) {
        // object construction
        // part one:
        // variable
        // declaration
        // with a type
        // declaration
        Employee jeff = new Employee();
        jeff.name = "Jeff";
        // object construction part two:
                // invoking a constructor
                // with the ** new ** keyword
                // followed by the name of a class
                // and parentheses (parens)
                // this creates a new instance of that class
        Employee elJeffe = new Employee();
        elJeffe.name = "El Jeffe";
        // object construction part three:
                // assignment operator =
        // assigns the newly created object to the reference variable
        Employee ace = new Employee();
        ace.name = "Ace";
        jeff.displayEmployeeInfo();
        elJeffe.displayEmployeeInfo();
        ace.displayEmployeeInfo();
        System.out.println(Employee.company);
        System.out.println(ace);
    }



}
