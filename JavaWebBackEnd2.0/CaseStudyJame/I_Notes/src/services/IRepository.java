package services;

import java.util.List;

public interface IRepository<T> {
    List<T> getAll();
    T getById(int id);
    boolean update(T t);
    boolean deleteById(int id);
    boolean save(T t);
}
