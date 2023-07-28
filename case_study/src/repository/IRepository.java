package repository;

import java.util.List;

public interface IRepository<O> {
    List<O> getList();
}
