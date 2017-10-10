package test.bookstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class BookStore {
	private String name;
	private ArrayList<Book> book=new ArrayList<Book>();
	public BookStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookStore(String name, ArrayList<Book> book) {
		super();
		this.name = name;
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Book> getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book.add(book);
	}
	public ArrayList<Author>hotRevenueAuthor(){
		HashSet<Author>listRevenueAuthor= new HashSet<Author>();
		for(int i=0;i<this.book.size();i++){
			for(Author author: this.book.get(i).getAuthor()){
				listRevenueAuthor.add(author);
			}
		}
		ArrayList<Author> topListRevenueAuthor=new ArrayList<Author>(listRevenueAuthor);
		for(int i=0;i<topListRevenueAuthor.size();i++){
			for(int j=0;j<this.book.size();j++){
				for(Author author: this.book.get(j).getAuthor()){
					if(topListRevenueAuthor.get(i).equals(author)){
						topListRevenueAuthor.get(i).setRevenue(author.getRevenue()+this.book.get(j).getSoldNumber()*this.book.get(j).getPrice());
					}
				}
			}
		}
	
		Collections.sort(topListRevenueAuthor, Author.compare1);
		ArrayList<Author> ar2=new ArrayList<Author>();
		for(int i=0;i<3;i++){
			ar2.add(topListRevenueAuthor.get(i));
		}
		return ar2;
	
	}
	public ArrayList<Author> getHotAuthors(){
		//xac dinh toan bo cac tac gia
		HashSet<Author> listAuthor=new HashSet<Author>();
		for(int i=0;i<this.book.size();i++){
			for(Author author: this.book.get(i).getAuthor()){
				listAuthor.add(author);
			}
		}
		//tinh toan so sach ban duoc cho moi tac gia
		ArrayList<Author> topAuthor=new ArrayList<Author>(listAuthor);
		for(int i=0;i<topAuthor.size();i++){
			for(int j=0;j<this.book.size();j++){
				for(Author author: this.book.get(j).getAuthor()){
					if(topAuthor.get(i).equals(author)){
						topAuthor.get(i).setSold(topAuthor.get(i).getSold()+this.book.get(j).getSoldNumber());
					}
				}
			}
		}
		Collections.sort(topAuthor, Author.compare);
		ArrayList<Author> arl=new ArrayList<Author>();
		for(int i=0;i<3;i++){
			arl.add(topAuthor.get(i));
		}
		return arl;
	}
	
	public void printHotAuthorsNew(){
		HashMap<Author,Long> mapList=new HashMap<Author,Long>();
		for(int i=0;i<this.book.size();i++){
			for(Author author: this.book.get(i).getAuthor()){
				if(mapList.get(author)==null){
					mapList.put(author, this.book.get(i).getSoldNumber());
				}else{
					long count=mapList.get(author);
					mapList.put(author,count+ this.book.get(i).getSoldNumber());
				}
			}
		}
		 Iterator it = mapList.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }

		
	}
	
	
	public long caculateRevenue(){
		long revenue=0;
		for(int j=0;j<this.book.size();j++){
			revenue=revenue+((this.book.get(j).getPrice())*(this.book.get(j).getSoldNumber()));
		}
		return revenue;
	}

	
	public Category hotCategory(){
		HashSet<Category> listCategory=new HashSet<Category>();
		for(int i=0;i<this.book.size();i++){
				listCategory.add(this.book.get(i).getCategory());
		}
		ArrayList<Category> topCategory=new ArrayList<Category>(listCategory);
		for(int i=0;i<topCategory.size();i++){
			for(int j=0;j<this.book.size();j++){
					if(topCategory.get(i).equals(this.book.get(j).getCategory())){
						topCategory.get(i).setSold(topCategory.get(i).getSold()+this.book.get(j).getSoldNumber());
					}
			}
		}
		Collections.sort(topCategory, Category.compare);
		return topCategory.get(0);
	}
}
