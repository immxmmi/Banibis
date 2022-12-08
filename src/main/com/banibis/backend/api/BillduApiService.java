package main.com.banibis.backend.api;

import main.com.banibis.models.AllClient;
import main.com.banibis.models.AllDocuments;
import main.com.banibis.models.Client;
import main.com.banibis.models.Document;

public interface BillduApiService {
    AllClient loadAllClients();

    Client loadClient();

    AllDocuments loadAllDocument();

    Document loadDocument();
}
