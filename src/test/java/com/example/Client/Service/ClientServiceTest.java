package com.example.Client.Service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {

    @Test
    void testCreateClient() {
        ClientService clientService = new ClientService();
        Client client = new Client();
        client.setFirstName("Juan");
        client.setLastName("Pérez");
        client.setMotherLastName("González");
        client.setIdentityDocument("123456789");

        String response = clientService.createClient(client);

        assertEquals("Client created successfully: Juan Pérez", response);
    }
}
