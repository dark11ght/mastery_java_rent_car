package com.shakhrai.pavel.mastery.java.mapper;

import com.shakhrai.pavel.mastery.java.dto.OrderDTO;
import com.shakhrai.pavel.mastery.java.entities.Order;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-03T11:55:58+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderDTO orderToOrderDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setId( order.getId() );
        orderDTO.setUser( order.getUser() );
        orderDTO.setCar( order.getCar() );
        orderDTO.setRentHours( order.getRentHours() );
        orderDTO.setTotalPrice( order.getTotalPrice() );
        orderDTO.setPaymentStatus( order.isPaymentStatus() );
        orderDTO.setConfirmByAdminStatus( order.isConfirmByAdminStatus() );
        orderDTO.setDateOfRegOrder( order.getDateOfRegOrder() );
        orderDTO.setOrderStatus( order.isOrderStatus() );
        orderDTO.setNotes( order.getNotes() );

        return orderDTO;
    }

    @Override
    public Order orderDTOToOrder(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( orderDTO.getId() );
        order.setUser( orderDTO.getUser() );
        order.setCar( orderDTO.getCar() );
        order.setRentHours( orderDTO.getRentHours() );
        order.setTotalPrice( orderDTO.getTotalPrice() );
        order.setPaymentStatus( orderDTO.isPaymentStatus() );
        order.setConfirmByAdminStatus( orderDTO.isConfirmByAdminStatus() );
        order.setDateOfRegOrder( orderDTO.getDateOfRegOrder() );
        order.setOrderStatus( orderDTO.isOrderStatus() );
        order.setNotes( orderDTO.getNotes() );

        return order;
    }
}
