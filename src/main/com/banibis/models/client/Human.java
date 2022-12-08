package main.com.banibis.models.client;

import lombok.Data;

import java.util.Date;
@Data
public class Human {
    protected int id;
    protected String country;
    protected String company;
    protected String fullname;
    protected String street;
    protected String zip;
    protected String city;
    protected String phone;
    protected String mobile;
    protected String fax;
    protected String web;
    protected String email;
    protected String tax_id;
    protected String vat_id;
    protected Date modified;
}
