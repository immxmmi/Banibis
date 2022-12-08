package main.com.banibis.models.client;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.com.banibis.models.Document;
import main.com.banibis.models.Invoice;
import main.com.banibis.models.Links;

import java.util.ArrayList;
import java.util.Date;

@Data
@NoArgsConstructor
public class Client extends Human {
    @SerializedName("degree")
    protected String degree;
    @SerializedName("salutation")
    protected String salutation;
    @SerializedName("name")
    protected String name;
    @SerializedName("surname")
    protected String surname;
    @SerializedName("created")
    protected Date created;
    @SerializedName("note")
    protected String note;
    @SerializedName("com_id")
    protected String comId;
    @SerializedName("bank_account")
    protected String bankAccount;
    @SerializedName("invoices")
    protected ArrayList<Invoice> invoices;
    @SerializedName("expenses")
    protected ArrayList<Object> expenses;
    @SerializedName("documents")
    protected ArrayList<Document> documents;
    @SerializedName("_links")
    protected Links links;
}
