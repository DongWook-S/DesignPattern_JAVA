package Part01_Iterator.Class;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;    // BookShelfIterator 가 검색할 책장
    private int index;              // 현재 보고 있는 책을 가르키는 첨자

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    // '다음 책'이 있는지 조사해서 있으면 true, 없으면 false
    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    // 현재 주목하는 책(Book의 인스턴스)을 반환하고, 다시 '다음' 으로 진행 시키는 메소드.
    @Override
    public Book next() {
        if (!hasNext()) { throw new NoSuchElementException(); }

        Book book = bookShelf.getBookAt(index);
        index++;

        return book;
    }
}
