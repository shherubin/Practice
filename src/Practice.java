public class Practice {
    public static void main(String[]args){
        //Person variableName = new Person("actual name")
        Person personOne = new Person ("Shaqing");
        Person defaultPerson = new Person();

        System.out.println("Person default is: " + defaultPerson.getFullName());
        System.out.println("Person 1 is: " + personOne.getFullName());

        //Change it from Shaqing Herubin to Droluc Thao
        personOne.setFirstName("Droluc");

        System.out.println("Person 1 now is: " + personOne.getFullName());
    }
}
