package main.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class AllClient {
    public int page;
    public int limit;
    public int pages;
    public int total;
    public Links _links;
    public Embedded _embedded;
}
