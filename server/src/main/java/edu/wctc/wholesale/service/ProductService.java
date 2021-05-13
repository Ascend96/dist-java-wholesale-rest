package edu.wctc.wholesale.service;

import edu.wctc.wholesale.ResourceNotFoundException;
import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.entity.Product;

import java.util.List;

public interface ProductService {
//    List<Product> getAllProduct();
    Product getProduct(int productId) throws ResourceNotFoundException;
}
