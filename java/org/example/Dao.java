package org.example;

public interface Dao<T> {

    T read();

    void write(T obj);
}
