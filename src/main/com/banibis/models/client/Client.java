package main.com.banibis.models.client;

import lombok.Data;
import main.com.banibis.models.Document;
import main.com.banibis.models.Invoice;
import main.com.banibis.models.Links;

import java.util.ArrayList;
import java.util.Date;

@Data
public class Client extends Human {
    protected String degree;
    protected String salutation;
    protected String name;
    protected String surname;
    protected Date created;
    protected String note;
    protected String com_id;
    protected String bank_account;
    protected ArrayList<Invoice> invoices;
    protected ArrayList<Object> expenses;
    protected ArrayList<Document> documents;
    protected Links _links;
}
