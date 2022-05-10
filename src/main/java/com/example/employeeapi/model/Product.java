package com.example.employeeapi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="productId")
    private Integer productId;

    @Column(name="productName")
    private String productName;

    @Column(name="supplierId")
    private Integer supplierId;

    @Column(name="categoryId")
    private Integer categoryId;

    @Column(name="quantityPerUnit")
    private Long quantityPerUnit;

    @Column(name="unitPrice")
    private Long unitPrice

    @Column(name="unitsInStock")
    private Long unitsInStock;

    @Column(name = "reorderLevel")
    private String reorderLevel;

    @Column(name="discontinued")
    private String discontinued;

}
