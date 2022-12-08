package main.com.banibis.backend.api;

import main.com.banibis.model.Client;
import main.com.banibis.model.Document;
import main.com.banibis.models.AllClient;
import main.com.banibis.models.AllDocuments;

public interface BillduApiService {


    // start
    Client loadClient();

    AllClient loadAllClients();

    AllDocuments loadAllDocument();

    Document loadDocument();
}
