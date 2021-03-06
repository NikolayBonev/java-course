
public class Book {
	private String name;
	private String author;
	private int pages;
	private int countBooks;
	
	public Book(){
		setName("");
		setAuthor("");
		setPages(0);
		setCountBooks(0);
	}
	
	public Book(String name, String author, int pages, int countBooks){
		this();
		
		setName(name);
		setAuthor(author);
		setPages(pages);
		setCountBooks(countBooks);
	}
	
	public int getCountBooks() {
		return this.countBooks;
	}

	public void setCountBooks(int countBooks) {
		if(countBooks >=0 ){
			this.countBooks = countBooks;
		}
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPages() {
		return this.pages;
	}
	
	public void setPages(int pages) {
		if(pages >= 0){
			this.pages = pages;
		}
	}
	
	@Override
	public int hashCode(){
		return (this.name +this.author+this.pages).hashCode();
	}
	
	@Override
	 public boolean equals(Object object){
		   if(object == null){
			   return false;
		   }
		   if(!(object instanceof Object)){
			   return false;
		   }
		   
		   Book book = (Book) object;
		   return this.hashCode() == book.hashCode();
		   
	   }
	
	@Override
	public String toString(){
		return String.format("Book: %s\nAuthor: %s\nPages: %d\nCount of copies: %d\n",this.name,this.author,this.pages,this.countBooks);
	
		
	}
	
}
