package edu.wctc.wholesale.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Product {
//        product_id int,
//    name varchar(200) not null,
//    cost double not null,
//    constraint product_pk
//        primary key (product_id)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private Double cost;

}
