package com.example.Client.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/create")
    public String createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }
}
