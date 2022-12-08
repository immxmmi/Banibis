package main.com.banibis.backend.api;

import main.com.banibis.models.AllClient;
import main.com.banibis.models.AllDocuments;
import main.com.banibis.models.Document;
import main.com.banibis.models.Client;

public interface BillduApiService {
    AllClient loadAllClients();

    Client loadClient();

    AllDocuments loadAllDocument();

    Document loadDocument();
}
