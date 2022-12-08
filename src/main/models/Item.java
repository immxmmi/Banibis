package main.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Item{
    public int id;
    public String custom_id;
    public String currency;
    public String vs;
    public String cs;
    public String ss;
    public String status;
    public String payment;
    public Object delivery_type;
    public String note;
    public String order_number;
    public String delivery_note;
    public int discount;
    public int sconto_days;
    public Date created;
    public Date modified;
    public Date issue_date;
    public Date delivery_date;
    public Object execution_date;
    public int maturity_date;
    public int total_price;
    public int price;
    public int tax;
    public String serial_number;
    public Client client;
    public Supplier supplier;
    public ArrayList<Object> payments;
    public String author;
    public Logo logo;
    public Object signature;
    public Object credit_doc;
    public String header;
    public String locale;
    public String document_color;
    public String paid_on;
    public String income_cash_voucher;
    public Links _links;
}