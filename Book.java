/**
 * A class that maintains information on a book, including author, title,
 * the number of pages, reference number, and number of times borrowed
 * allows for the addition of a reference number via set method
 * includes a borrow method that increments borrowed by one
 * implemented methods to get, and print all fields
 * printDetails prints all fields simultaneously
 * @author Nicholas Trilone
 * @version 2021.09.20
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    //added 2.85
    private int pages;
    //added 2.88
    private String refNumber;
    //added 2.91
    private int borrowed;
    
    /**
     * Set the author, title, pages, and ref fields when this object
     * is constructed.
     * modified for 2.85 and 2.88
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
     * Returns reference number
     * for 2.88
     */
    public String getRefNumber()
    {
        return refNumber;   
    }
    
    /**
     * Returns borrowed number
     * for 2.91
     */
    public int getBorrowed()
    {
        return borrowed;   
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
     * Prints reference number
     * for 2.88
     */
    public void printRefNumber()
    {
        //prints reference number if set, says that it's not set if it's not set
        if(refNumber!=""){
           System.out.println("This book's reference number is "+refNumber+".");  
        }
        else{
           System.out.println("This book's reference number has not been set.");
        }
    }
    
    /**
     * Prints number of times the book has been borrowed
     * for 2.91
     */
    public void printBorrowed()
    {
        System.out.println("This book's has been borrowed "+borrowed+" times.");
    }
    
    /**
     * Sets reference number(String)
     * must be at least three characters long
     * for 2.88
     * modified for 2.90
     */
    public void setRefNumber(String ref)
    {
        if(ref.length()>=3){
            refNumber=ref;
        }
        else{
         System.out.println("Error: Reference number must be at least three characters long!"); 
        }
    }
    
    /**
     * Increments borrowed field by one
     * for 2.91
     */
    public void borrow()
    {
        borrowed++;
    }
    
    /**
     * Prints a formatted list of book qualities
     * for 2.87
     * modified for 2.88
     * modified for 2.89
     * modified for 2.91
     */
    public void printDetails()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Number of Pages: "+pages);
        //I implemented something very similar to this before even looking at 2.89
        if(refNumber.length()>=1){
           System.out.println("Reference Number: "+refNumber);  
        }
        else{
            //why print ZZZ and not something useful to the user, like Reference Number: N/A?
           System.out.println("ZZZ");   
        }
        System.out.println("Number of Times Borrowed: "+borrowed);
    }
}
