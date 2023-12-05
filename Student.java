public class Student extends Person {
    private String login;
    private int totalWatched;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalWatched() {
        return totalWatched;
    }

    public void setTotalWatched(int totalWatched) {
        this.totalWatched = totalWatched;
    }

    public Student(String name, int age, String gender, String login) {
        super(name, age, gender);
        this.login = login;
        this.totalWatched = 0;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "\nlogin='" + login + '\'' +
                ", totalWatched=" + totalWatched +
                '}';
    }
}
