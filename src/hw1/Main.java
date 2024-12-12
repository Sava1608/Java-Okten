package hw1;

public class Main {
    public static void main(String[] args){
        Book[] books = new Book[]{
                new Book("To Kill a Mockingbird", 281, new String[]{"Harper Lee", "Undefiend Author"}, "Fiction"),
                new Book("The Great Gatsby", 180, new String[]{"F. Scott Fitzgerald", "F. Scott Fitzgerald JR"}, "Drama"),
                new Book("The Catcher in the Rye", 277, new String[]{"J.D. Salinger", "Author2"}, "Coming-of-Age Fiction"),
                new Book("Pride and Prejudice", 432, new String[]{"Author1", "Jane Austen"}, "Romance"),
                new Book("Harry Potter", 500, new String[]{"J.K. Rowling"}, "Fantasy")
        };
        for (Book book : books){
            System.out.println(book);
        }
        Car[] cars = new Car[]{
                new Car("Audi", 380, 3.0, true),
                new Car("BMW", 480, 3.2, true),
                new Car("Mercedes", 500, 4.6, true),
                new Car("Mustang", 550, 5.0, false),
                new Car("Lada Russian Gavno", 1, 0.1, false)
        };
        for (Car car : cars){
            System.out.println(car);
        }
        Dog[] dogs = new Dog[]{
                new Dog("Barsik", 5, "Pes"),
                new Dog("Bob", 7, "Labrador"),
                new Dog("My friend", 21, "Human)))"),
                new Dog("@", 2, "Gmail"),
                new Dog("Jack", 4, "Espaniel")
        };
        for (Dog dog : dogs){
            System.out.println(dog);
        }
        Post[] posts = new Post[]{
                new Post(1, 10, "Bad Post", "Lorem ipsum1"),
                new Post(2, 20, "Good Post", "Lorem ipsum2"),
                new Post(3, 30, "Post1", "Lorem ipsum3"),
                new Post(4, 40, "Post2", "Lorem ipsum4"),
                new Post(5, 50, "Post3", "Lorem ipsum5"),
        };
        for (Post post : posts){
            System.out.println(post);
        }
        Comment[] comments = new Comment[]{
                new Comment(1,5,"User1", "Gmail-1", "Lorem Ipsum-1"),
                new Comment(2,4,"User2", "Gmail-2", "Lorem Ipsum-2"),
                new Comment(3,3,"User3", "Gmail-3", "Lorem Ipsum-3"),
                new Comment(4,2,"User4", "Gmail-4", "Lorem Ipsum-4"),
                new Comment(5,1,"User5", "Gmail-5", "Lorem Ipsum-5")
        };
        for (Comment comment : comments){
            System.out.println(comment);
        }
    }

}
