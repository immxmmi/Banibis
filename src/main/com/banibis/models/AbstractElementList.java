package main.com.banibis.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public abstract class AbstractElementList {
    @SerializedName("page")
    public int page;
    @SerializedName("limit")
    public int limit;
    @SerializedName("pages")
    public int pages;
    @SerializedName("total")
    public int total;
    @SerializedName("_links")
    public Links links;

}
