package api.ficheclient;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class ClientController {
    private List<Client> clientList = new ArrayList<>();

    // Opération de création d'un utilisateur
    @PostMapping("/")
    public Client createClient(@RequestBody Client client) {
        clientList.add(client);
        return client;
    }

    // Opération de lecture de tous les utilisateurs
    @GetMapping("/")
    public List<Client> getAllClients() {
        return clientList;
    }

    // Opération de lecture d'un utilisateur par ID
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable String id) {
        for (Client client : clientList) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        return null;
    }

    // Opération de mise à jour d'un utilisateur
    @PutMapping("/{id}")
    public Client updateClient(@PathVariable String id, @RequestBody Client client) {
        for (int i = 0; i < clientList.size(); i++) {
            if (clientList.get(i).getId().equals(id)) {
                clientList.set(i, client);
                return client;
            }
        }
        return null;
    }

    // Opération de suppression d'un utilisateur
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable String id) {
        clientList.removeIf(client -> client.getId().equals(id));
    }
}
