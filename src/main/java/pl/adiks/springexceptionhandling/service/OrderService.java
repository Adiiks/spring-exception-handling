package pl.adiks.springexceptionhandling.service;

import org.springframework.stereotype.Service;
import pl.adiks.springexceptionhandling.dao.OrderDao;
import pl.adiks.springexceptionhandling.exception.OrderServiceException;
import pl.adiks.springexceptionhandling.model.Order;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private final OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @PostConstruct
    private void addOrderToDb() {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Mobile", "Electronics", 8000));
        orders.add(new Order(2, "Bike", "Vehicle", 90000));

        orderDao.saveAll(orders);
    }

    public double getPrice(String productName) throws OrderServiceException {

        Order order = orderDao.findByName(productName)
                .orElseThrow(() -> new OrderServiceException("Product " + productName + " not found"));
        return order.getAmount();
    }
}
