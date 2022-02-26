package com.servey.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket")
public class Ticket {
    
    @Id
    public Long getId() {
        return id;
    }

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }


}
