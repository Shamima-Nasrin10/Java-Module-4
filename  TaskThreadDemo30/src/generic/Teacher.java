

package generic;



public class Teacher<E> extends GenericArray{
    private String name;
    private String email;
    private String address;
    private int id;
    private int salary;

    public Teacher() {
    }

    public Teacher(String name, String email, String address, int id, int salary) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", email=" + email + ", address=" + address + ", id=" + id + ", salary=" + salary + '}'+"\n";
    }

 
    
    
}
