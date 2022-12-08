package main.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Supplier{
    public int id;
    public String country;
    public String company;
    public String fullname;
    public String street;
    public String street2;
    public String zip;
    public String city;
    public String province;
    public String phone;
    public String mobile;
    public String fax;
    public String email;
    public String paypal_email;
    public String web;
    public String business_id;
    public String tax_id;
    public String vat_id;
    public int vat_payer;
    public String registered;
    public Logo logo;
    public String modified;
}