package test.bookstore;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Author a1=new Author(1, "Annie", 15, 0);
		Author a2=new Author(2, "Bengi", 20, 0);
		Author a3=new Author(3, "Chaser", 18, 0);
		Author a4=new Author(4, "Dandy", 16, 0);
		Author a5=new Author(5, "Froggen", 15, 0);
		
		ArrayList<Author> ar1 =new ArrayList<Author>();
		ar1.add(a5); ar1.add(a3); ar1.add(a2);
		
		ArrayList<Author> ar2 =new ArrayList<Author>();
		ar2.add(a5); ar2.add(a4); ar2.add(a1);
		
		ArrayList<Author> ar3 =new ArrayList<Author>();
		ar3.add(a4); ar3.add(a2); ar3.add(a1);
		
		Category c1=new Category(1, "Romance" , 0);
		Category c2=new Category(2, "Fiction" , 0);
		Category c3=new Category(3, "Drama" , 0);
		
		Book b1=new Book(1, "First Book", 20000, 2000, ar1, c1);
		Book b2=new Book(2, "Second Book", 30000, 1500, ar2, c2);
		Book b3=new Book(3, "Third Book", 40000, 1000, ar3, c3);
		
		ArrayList<Book> br=new ArrayList<Book>();
		br.add(b1); br.add(b2); br.add(b3);
		
		BookStore BS1=new BookStore("Local Lib", br);
		System.out.println(BS1.caculateRevenue()+" VND");
		for(Author author: BS1.getHotAuthors()){
			System.out.println(author);
		}
		System.out.println("+++++++++++");
		BS1.printHotAuthorsNew();
		System.out.println("+++++++++++");
		System.out.println(BS1.hotCategory());
		System.out.println("=====");
		for(Author author:BS1.hotRevenueAuthor()){
			System.out.println(author);
	     } 
		
		
	}
	

}
