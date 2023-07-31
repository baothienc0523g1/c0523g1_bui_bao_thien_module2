package repository;

import model.person.Customer;

import java.util.List;

public interface IRepository<O> {
    List<O> getList();
    void add(O o);
    void delete(String id);
}
