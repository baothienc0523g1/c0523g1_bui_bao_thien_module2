package repository.promotion;

import repository.IRepository;

import java.util.List;

public interface IPromotionRepository {

    List<String> getList();
    List<String> listCustomerUseVoucher();
}
