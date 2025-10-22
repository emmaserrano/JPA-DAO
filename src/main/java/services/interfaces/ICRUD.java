package services.interfaces;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {


    List<T> getAll(String nameQuery, Class<T> clazz);


    T insert(T entity);


    T update(T entity);


    void delete(T entity);


    Optional<T> findById(Long id, Class<T> clazz);
}
