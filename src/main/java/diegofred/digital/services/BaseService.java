package diegofred.digital.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseService<T> {


    public List<T> findAll();

    public Page<T> findAll(Pageable pageable);

    public T findById(Long id);

    public T save(T entity);

    public void deleteById(Long id);


    
}
