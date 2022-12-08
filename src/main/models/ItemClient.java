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
public class ItemClient {
    public int id;
    public String country;
    public String degree;
    public String salutation;
    public String company;
    public String name;
    public String surname;
    public String fullname;
    public String street;
    public String zip;
    public String city;
    public Date created;
    public Date modified;
    public String phone;
    public String mobil;
    public String fax;
    public String web;
    public String note;
    public String email;
    public String com_id;
    public String tax_id;
    public String vat_id;
    public String bank_account;
    public ArrayList<Invoice> invoices;
    public ArrayList<Object> expenses;
    public ArrayList<Object> documents;
    public Links _links;
}
