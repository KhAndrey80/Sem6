package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persistable persister = new Persister();
        UserReport userReport = new UserReport();
        persister.save(user);
        userReport.report(user);
        // user.report();
        // user.save();
    }
}