package com.marker_interface;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Movie movie=new Movie("Harry Potter",2000);
        Movie clonedMovie= (Movie)movie.clone();
        System.out.println(clonedMovie.getTitle());

        Exam exam=new Exam();
        Disposer disposer=new Disposer();
        disposer.dispose(exam);
    }
}
