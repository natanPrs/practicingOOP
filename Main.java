public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Student s[] = new Student[2];
        s[0] = new Student("Fernando", 33, "M","FernandinhoDoGrau" );
        s[1] = new Student("Natan", 21, "M", "NatanAkaPassoLargo");

        Visualization vis[] = new Visualization[5];
        vis[0] = new Visualization(s[0], v[2]); //Fernando assite HTML5
        vis[0].rate();
        System.out.println(vis[0].toString());

        vis[1] = new Visualization(s[0], v[1]); //Fernando assiste PHP
        vis[0].rate(87.0f);
        System.out.println(vis[1].toString());

        System.out.println(vis.toString());
        //System.out.println(v[0].toString());
        //System.out.println(s[0].toString());
    }
}