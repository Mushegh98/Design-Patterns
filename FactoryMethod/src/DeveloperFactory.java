public interface DeveloperFactory {

    static Developer CreateDeveloper(String str)
    {
        switch (str)
        {
            case "Java":
                return new JavaDeveloper();

            case "C#":
                return new CsDeveloper();

            default:
                throw new RuntimeException();
        }
    }
}
