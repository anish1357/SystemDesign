package Structural.Composite;

public class Client {
     public static void main(String args[]){
        Directory movieDirectory = new Directory("Movies");
        Directory horrorMovies = new Directory("Horror Movies");
        Directory comedyMovies = new Directory("Comedy Movies");
        movieDirectory.add(horrorMovies);
        movieDirectory.add(comedyMovies);
        File conjuring = new File("The Conjuring");
        File insidious = new File("Insidious");
        File hangover = new File ("Hangover");
        horrorMovies.add(conjuring);
        horrorMovies.add(insidious);
        comedyMovies.add(hangover);

        comedyMovies.ls();
        movieDirectory.ls();

     }
}
