package com.shakhrai.pavel.mastery.java.mapper;

import com.shakhrai.pavel.mastery.java.dto.OrderDTO;
import com.shakhrai.pavel.mastery.java.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderMapper ORDER_MAPPER = Mappers.getMapper(OrderMapper.class);

    OrderDTO orderToOrderDTO(Order order);

    Order orderDTOToOrder(OrderDTO orderDTO);

}
