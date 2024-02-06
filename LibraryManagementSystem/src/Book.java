
import java.util.*;
class Book {
    private String title;

    private  String author;
    private int number;
    private  int price;
    private  int noOfCopies;



    public Book(String title, String author,  int number,int price, int noOfCopies){
        this.title=title;
        this.author=author;
        this.number=number;
        this.price=price;
        this.noOfCopies=noOfCopies;
    }
    public String getTitle(){

        return title;
    }
    public String getAuthor(){

        return author;
    }
    public int getNumber(){

        return number;
    }
    public int getPrice(){

        return price;
    }
    public int getnoOfCopies(){

        return noOfCopies;
    }



}
