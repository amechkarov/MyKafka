package com.mykafka;

import com.mykafka.dto.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CustomerSerializationTest {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testCustomerSerialization() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Test Name");
        customer.setEmail("test@example.com");
        customer.setContactNo("1234567890");

        assertDoesNotThrow(() -> {
            String jsonString = objectMapper.writeValueAsString(customer);
            System.out.println("Serialized Customer: " + jsonString);
        });
    }
}
