public class MyClass {
    public static void main(String[] args) {
        Developer javadeveloper= DeveloperFactory.CreateDeveloper("Java");
        javadeveloper.WriteCode();
        Developer csdeveloper=DeveloperFactory.CreateDeveloper("C#");
        csdeveloper.WriteCode();
    }
}
