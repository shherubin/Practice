public class Person {
    private String firstName = "Siqi";
    private String lastName = "Thaovangsoua";

    //Empty constructor which makes name default tp "Siqi Herbuin"
    public Person(){}

    //Non constructor which makes this.name equal to the parameter name
    public Person(String name){
        this.firstName = name;
    }

    /**
     * method headers consist of the following -
     * 1. type of method: public
     * 2. variable type the method returns: String
     * 3. method name: getName()
     * 4. inside of the () can be parameters
     *
     * Note on accessors -> usually called getVariable()
     * so if name is the variable name then it would be called getName()
     *
     * void means return nothing
     *
     * return means it's going to return that variable
     */

    //these are called accessors which will return the name (always returns a variable)
    public String getFirstName() {
        return this.firstName;
    }

    //these are called mutators which will update the name (never returns a variable)
    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}
