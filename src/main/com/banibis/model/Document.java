package main.com.banibis.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Document {
        private int id;
        private String currency;
        private String vs;
        private String cs;
        private String ss;
        private String status;
        private String payment;
        private String delivery_type;
        private String note;
        private String order_number;
        private String delivery_note;
        private int discount;
        private int sconto_days;
        private String created;
        private String modified;
        private String issue_date;
        private String delivery_date;
        private String execution_date;
        private int maturity_date;
        private int total_price;
        private int price;
        private int tax;
        private String serial_number;
        private ShippingClient client;
        private Supplier supplier;
        private List payments;
        private String author;
        private Object logo;
        private String signature;
        private String credit_doc;
        private String header;
        private String locale;
        private String document_color;
        private String paid_on;
        private String income_cash_voucher;
        private Object _linkes;
        private Object pdf;
}
