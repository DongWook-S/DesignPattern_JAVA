package Iterator.Class;

import java.util.Iterator;

/*
 *  책장을 나타내는 클래스
 *  집합체를 다루기 위해 Iterable<Book> 인터페이스를 구현하고 있음
 */
public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    // 오버라이드
    // 책장에 꽂혀 잇는 책을 반복해서 처리하고 싶을 때 iterator 메소드를 호출
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
