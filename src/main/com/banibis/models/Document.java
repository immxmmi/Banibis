package main.com.banibis.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class Document implements Printer {
    @SerializedName("id")
    protected int id;
    @SerializedName("currency")
    protected String currency;
    @SerializedName("vs")
    protected String vs;
    @SerializedName("cs")
    protected String cs;
    @SerializedName("ss")
    protected String ss;
    @SerializedName("status")
    protected String status;
    @SerializedName("payment")
    protected String payment;
    // Objekt ? ENUM ?
    @SerializedName("delivery_type")
    protected Object deliveryType;
    @SerializedName("note")
    protected String note;
    @SerializedName("order_number")
    protected String orderNumber;
    @SerializedName("delivery_note")
    protected String deliveryNote;
    @SerializedName("discount")
    protected int discount;
    @SerializedName("sconto_days")
    protected int scontoDays;
    @SerializedName("created")
    protected Date created;
    @SerializedName("modified")
    protected Date modified;
    @SerializedName("issue_date")
    protected Date issueDate;
    @SerializedName("delivery_date")
    protected Date deliveryDate;
    // DATE ? or Number
    @SerializedName("execution_date")
    protected Object executionDate;
    @SerializedName("maturity_date")
    protected int maturityDate;
    @SerializedName("total_price")
    protected int totalPrice;
    @SerializedName("price")
    protected int price;
    @SerializedName("tax")
    protected int tax;
    @SerializedName("serial_number")
    protected String serialNumber;
    @SerializedName("shippingClient")
    protected ShippingClient shippingClient;
    @SerializedName("supplier")
    protected Supplier supplier;
    // List of OBJEKT "Payment" ?
    @SerializedName("payments")
    protected ArrayList<Object> payments;
    @SerializedName("author")
    protected String author;
    @SerializedName("logo")
    protected Logo logo;
    @SerializedName("signature")
    protected Href signature;
    // OBJEKT ? STRING
    @SerializedName("credit_doc")
    protected Object creditDoc;
    @SerializedName("header")
    protected String header;
    @SerializedName("locale")
    protected String locale;
    @SerializedName("document_color")
    protected String documentColor;
    // DATE ??
    @SerializedName("paid_on")
    protected Object paidOn;
    @SerializedName("income_cash_voucher")
    protected String incomeCashVoucher;
    @SerializedName("_links")
    protected Links links;
    @SerializedName("pdf")
    private Href pdf;

    @Override
    public void printClass() {
        System.out.println(this);
    }


}
