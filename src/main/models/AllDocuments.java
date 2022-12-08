package main.models;

import lombok.Data;

@Data
public class AllDocuments {
    public int page;
    public int limit;
    public int pages;
    public int total;
    public Links _links;
    public Embedded _embedded;
}
