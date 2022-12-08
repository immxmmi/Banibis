package main.com.banibis.backend.api;

import main.com.banibis.models.AllClient;
import main.com.banibis.models.AllDocuments;
import main.com.banibis.models.Document;
import main.com.banibis.models.client.Client;

public interface BillduApiService {


    // start
    Client loadClient();

    AllClient loadAllClients();

    AllDocuments loadAllDocument();

    Document loadDocument();
}
