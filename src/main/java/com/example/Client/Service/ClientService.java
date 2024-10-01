package com.example.Client.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    private List<Client> clients = new ArrayList<>();

    public String createClient(Client client) {
        clients.add(client);
        return "Client created successfully: " + client.getFirstName() + " " + client.getLastName();
    }

    // Aquí puedes agregar más métodos según sea necesario
}
