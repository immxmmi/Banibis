package main.com.banibis.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Client {
    private int id;
    private String country;
    private String degree;
    private String salutation;
    private String company;
    private String name;
    private String surname;
    private String fullname;
    private String street;
    private String zip;
    private String city;
    private String created;
    private String modified;
    private String phone;
    private String mobil;
    private String fax;
    private String web;
    private String note;
    private String email;
    private String com_id;
    private String tax_id;
    private String vat_id;
    private String bank_account;
    private List invoices;
    private List expenses;
    private List documents;
    private Object _links;
}
