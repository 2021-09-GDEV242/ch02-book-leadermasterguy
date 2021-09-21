/**
 * A class that maintains information on a book, including author, title,
 * and the number of pages.
 * implemented methods to get, and print fields
 * printDetails prints all fields simultaneously
 * @author Nicholas Trilone
 * @version 2021.09.20
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    /**
     * Returns book author
     * for 2.83
     */
    public String getAuthor()
    {
        return author;   
    }
    
    /**
     * Returns book title
     * for 2.83
     */
    public String getTitle()
    {
        return title;   
    }
    
    /**
     * Returns book pages
     * for 2.85
     */
    public int getPages()
    {
        return pages;   
    }
    
    /**
     * Prints book title
     * for 2.84
     */
    public void printAuthor()
    {
        System.out.println("This book's author is "+author+".");
    }
    
    /**
     * Prints book title
     * for 2.84
     */
    public void printTitle()
    {
        System.out.println("This book's title is "+title+".");
    }
    
    /**
     * Prints number of book pages
     * for 2.85
     */
    public void printPages()
    {
        System.out.println("This book's has "+pages+" pages.");
    }
    
    /**
     * Prints a formatted list of book qualities
     * for 2.87
     */
    public void printDetails()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Number of Pages:"+pages);
    }
}
