import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> teamlist=new ArrayList<>();
    public void AddDeveloper(Developer developer)
    {
        teamlist.add(developer);
    }
    public void RemoveDeveloper(Developer developer)
    {
        teamlist.remove(developer);
    }
    public void CreateProject()
    {
        System.out.println("Team created project");
        for(Developer developer : teamlist)
        {
            developer.WriteCode();
        }
    }
}
