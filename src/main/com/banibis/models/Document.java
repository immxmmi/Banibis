package main.com.banibis.models;

import lombok.Data;
import main.com.banibis.models.client.ShippingClient;
import main.com.banibis.models.client.Supplier;

import java.util.ArrayList;
import java.util.Date;

@Data
public class Document {
    protected int id;
    protected String currency;
    protected String vs;
    protected String cs;
    protected String ss;
    protected String status;
    protected String payment;
    protected Object delivery_type;
    protected String note;
    protected String order_number;
    protected String delivery_note;
    protected int discount;
    protected int sconto_days;
    protected Date created;
    protected Date modified;
    protected Date issue_date;
    protected Date delivery_date;

    // DATE ? or Number
    protected Object execution_date;
    protected int maturity_date;
    protected int total_price;
    protected int price;
    protected int tax;
    protected String serial_number;
    protected ShippingClient shippingClient;
    protected Supplier supplier;

    // ?
    protected ArrayList<Object> payments;
    protected String author;
    protected Logo logo;
    protected Href signature;

    // ?
    protected Object credit_doc;
    protected String header;
    protected String locale;
    protected String document_color;

    // DATE ??
    protected Object paid_on;
    protected String income_cash_voucher;
    protected Links _links;

    // Only in Document
    private Object pdf;
}
