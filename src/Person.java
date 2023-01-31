public class Person{
    // class attributes
    private String name;
    private int age ;
    private double salary;

    // class methods

    /*
    * It's the first constructor of the class : It initializes the attributes with default values
    * */
    public Person(){
        name = "Person";
        age = 0;
        salary = 0.0;
    }

    /*
    * It's the second constructor of the class : It initializes the attributes with parameters values
    * */
    public  Person(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /*
     * It's the second constructor of the class : It initializes the name and age attributes with parameters values and
         sets salary attribute at -1
     * */
    public  Person(String name, int age){
        this.name = name;
        this.age = age;
        salary = -1;
    }

    /*
    * returns salary value
    * @param : empty
    * @returns :
    * - salary : double
    * */
    public double getSalary() {
        return salary;
    }

    /*
     * returns age value
     * @param : empty
     * @returns :
     * - age : int
     * */
    public int getAge() {
        return age;
    }

    /*
     * returns name value
     * @param : empty
     * @returns :
     * - name : String
     * */
    public String getName() {
        return name;
    }

    /*
    * Display information in the console
    * @param : empty
    * @returns : void
    * */
    public void displayInfo(){
        System.out.println("name : "+name+"\nage: "+age+"\nsalary: "+salary);
    }

    }
}
