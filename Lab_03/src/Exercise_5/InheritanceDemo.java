package Exercise_5;




public class InheritanceDemo {
    
    public static void main(String[] args) {
        Person p1 = new Person("Chanuth","Balapitiya");
        p1.showDetails();
        Student s1 = new Student("Kumara","Colombo","It 2001");
        s1.showDetails();
        partTimeStudent ps1 = new partTimeStudent("Janaki","Kandy","It2145",10);
        ps1.showDetails();
    }
}