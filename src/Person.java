public class Person {
    private String name;
    private String lastName;
    private int age;
    private String gender;

    //Konstruktor

    public Person(String name, String lastName, int age, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.age=age;
        this.gender=gender;
/*
        if (eyeColor != null) {
            this.eyeColor = eyeColor;
        } else {
            System.out.println("Brak zniżki");
        }*/
    }
/*
    public Person(String name, String lastName) {
        this(name, lastName, null);
    }
*/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
