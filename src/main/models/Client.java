package main.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Client{
    public int id;
    public String degree;
    public String salutation;
    public String company;
    public String name;
    public String surname;
    public String fullname;
    public String street;
    public String street2;
    public String zip;
    public String city;
    public String province;
    public String country;
    public String shipping_company;
    public String shipping_name;
    public String shipping_surname;
    public String shipping_fullname;
    public String shipping_street;
    public String shipping_street2;
    public String shipping_zip;
    public String shipping_city;
    public String shipping_province;
    public String shipping_country;
    public Object created;
    public Object modified;
    public String phone;
    public String mobile;
    public String fax;
    public String web;
    public String note;
    public String email;
    public Object com_id;
    public String tax_id;
    public String vat_id;
    public String bank_account;
    public ArrayList<Object> invoices;
    public ArrayList<Object> expenses;
    public Documents documents;
    public String ratings;
    public Links _links;
}