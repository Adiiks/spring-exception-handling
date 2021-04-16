package pl.adiks.springexceptionhandling.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDER_TB")
public class Order {

    @Id
    private int id;

    private String name;
    private String category;
    private double amount;
}
