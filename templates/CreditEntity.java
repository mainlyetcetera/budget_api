package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Date;

@Entity
@Table(name = "credits")
public class CreditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double total;

    private Date date;

    private Long category_id;

    private Long budget_id;

    private String listed_on_stmt_as;

    public CreditEntity() {}

    public CreditEntity(
            Long id, 
            String name, 
            Double total, 
            Date date, 
            Long category_id, 
            Long budget_id, 
            String listed_on_stmt_as
    ) {
        this.id = id;
        this.name = name;
        this.total = total; 
        this.date = date; 
        this.category_id = category_id; 
        this.budget_id = budget_id; 
        this.listed_on_stmt_as = listed_on_stmt_as;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getCategoryId() {
        return category_id;
    }

    public void setCategoryId(Long category_id) {
        this.category_id = category_id;
    }

    public Long getBudgetId() {
        return budget_id;
    }

    public void setBudgetId(Long budget_id) {
        this.budget_id = budget_id;
    }

    public String getListedOnStmtAs() {
        return listed_on_stmt_as;
    }

    public void setListedOnStmtAs(String listed_on_stmt_as) {
        this.listed_on_stmt_as = listed_on_stmt_as;
    }

}
