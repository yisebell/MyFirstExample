public class Persona {

  private String name;
  private String lastName;
  private int age;

  Persona(){};

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String toString() {
    return "Persona -> ".concat("Name: ").concat(getName()).concat(", ")
      .concat("LastName: ").concat(getLastName()).concat(", ")
      .concat("Age: ") + getAge();
  }
}