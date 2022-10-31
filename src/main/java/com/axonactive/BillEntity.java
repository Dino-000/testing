package com.axonactive;

import javax.persistence.*;

@Entity
@Table(name = "term_entity")
public class BillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String customer;
    @Column(name = "total_bill")
    private Double totalBill;

    public BillEntity() {
    }


    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Double totalBill) {
        this.totalBill = totalBill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
