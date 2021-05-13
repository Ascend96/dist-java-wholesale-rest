package edu.wctc.wholesale.controller.rest;

import edu.wctc.wholesale.dto.OrderDTO;
import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.repos.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderRestController {
    @Autowired
    private OrderRepository orderRepository;

    private OrderDTO convert(Order order){
        OrderDTO dto = new OrderDTO();
        dto.setCustomerName(order.getCustomer().getName());
        dto.setDate(order.getPurchaseDate());
        dto.setPoNumber(order.getPurchaseDate());
        dto.setProductName(order.getProduct().getName());
        dto.setShipped(order.getShippedDate());
        dto.setTerms(order.getTerms());
        dto.setProductName(order.getProduct().getName());
        dto.setTotal(order.getProduct().getCost());
        return dto;
    }

    @GetMapping("/api/orders")
    @CrossOrigin(origins = "https://localhost::63342")
    public List<OrderDTO> getOrders(){
        Iterable<Order> orderlist = orderRepository.findAll();
        List<OrderDTO> dtoList = new ArrayList<>();

        for (Order order : orderlist){
            dtoList.add(convert(order));
        }

        return dtoList;
    }
}
