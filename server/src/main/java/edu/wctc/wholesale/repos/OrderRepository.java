package edu.wctc.wholesale.repos;

import edu.wctc.wholesale.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository <Order, Integer> {
}
