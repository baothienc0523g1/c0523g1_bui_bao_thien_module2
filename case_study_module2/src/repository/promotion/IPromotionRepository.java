package repository.promotion;

import repository.IRepository;

import java.util.List;

public interface IPromotionRepository extends IRepository {
    @Override
    List<String> getList();
    List<String> listCustomerUseVoucher();
}
