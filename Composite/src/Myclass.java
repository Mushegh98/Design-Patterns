public class Myclass {
    public static void main(String[] args) {
        Team team=new Team();
        team.AddDeveloper(new JavaDeveloper());
        team.AddDeveloper(new CsDeveloper());
        team.CreateProject();
    }
}
