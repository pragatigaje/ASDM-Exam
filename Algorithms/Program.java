public class Program {
    public static void Greet(String s)
    {
        switch(s)
        {
            case "Faculty" : 
                System.out.println("Good Morning! Todays lecture is scheduled at 10 a.m.");
                break;

            case "Student" : 
                System.out.println("Good Morning! There is no session today!");
                break;
            default :
                System.out.println("Good Morning! Welcome to CDAC Kharghar!");

        }
    }
    public static void main(String[] args) {
        String s = "Faculty";
        Greet(s);
    }
}
