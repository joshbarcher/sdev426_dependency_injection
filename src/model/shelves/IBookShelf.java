package model.shelves;

import model.books.Book;

public interface IBookShelf
{
    public void add(Book book);
    public boolean remove(Book book);
    public boolean contains(Book book);
}

