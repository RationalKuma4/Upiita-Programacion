/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolw;

/**
 *
 * @author Wilfo
 */
public class clsBook {

    public String book;
    public String IdBook;

    public clsBook(String IdBook, String book) {
        this.IdBook = IdBook;
        this.book = book;
    }

    public String getId() {
        return IdBook;
    }

    public void setId(String Id) {
        this.IdBook = Id;
    }

    public String getInfo() {
        return book;
    }
    
     public void setInfo(String Info) {
        this.book = Info;
    }

    public String toString() {
        return book;
    }
}
