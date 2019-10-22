using System;

namespace Singleton
{
    class Single
{
    private static Single ob = null;
    protected Single()
    {

    }
    public static Single Instance()
    {
        if(ob==null)
        {
            ob = new Single();
        }
        
            return ob;
        
    }
}
    class Program
    {
        static void Main(string[] args)
        {
            Single sing1 = Single.Instance();
            Single sing2 = Single.Instance();
            Console.WriteLine(sing1.GetHashCode());
            Console.WriteLine(sing2.GetHashCode());
        }
    }
}
