package main.com.banibis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShippingClient extends Client{
        private String street2;
        private String province;
        private String shipping_company;
        private String shipping_name;
        private String shipping_surname;
        private String shipping_fullname;
        private String shipping_street;
        private String shipping_street2;
        private String shipping_zip;
        private String shipping_city;
        private String shipping_province;
        private String shipping_country;
        private List ratings;
}
