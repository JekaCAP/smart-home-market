package ru.practicum.interaction.api.dto.warehouse;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShippedToDeliveryRequestDto {
    @NotNull(message = "Order ID не может быть пустым")
    UUID orderId;

    @NotNull(message = "Delivery ID не может быть пустым")
    UUID deliveryId;
}
