package pl.adiks.springexceptionhandling.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adiks.springexceptionhandling.model.Order;

import java.util.Optional;

public interface OrderDao extends JpaRepository<Order, Integer> {

    Optional<Order> findByName(String productName);
}
