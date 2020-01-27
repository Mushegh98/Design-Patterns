public class MyClass {
    public static void main(String[] args) {
        Project project=new Project(1,"MyProject");
        System.out.println(project.toString());
        Project project1=(Project)project.copy();
        System.out.println(project1.toString());
    }
}
