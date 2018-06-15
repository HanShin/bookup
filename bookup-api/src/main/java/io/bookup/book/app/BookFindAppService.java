package io.bookup.book.app;

import io.bookup.book.infra.crawler.Book;
import io.bookup.book.infra.crawler.BookCrawlerComposite;
import org.springframework.stereotype.Service;

/**
 * @author woniper
 */
@Service
public class BookFindAppService {

    private final BookCrawlerComposite bookCrawler;

    public BookFindAppService(BookCrawlerComposite bookCrawlerComposite) {
        this.bookCrawler = bookCrawlerComposite;
    }

    public Book getBook(String isbn) {
        return bookCrawler.findByIsbn(isbn);
    }

}
