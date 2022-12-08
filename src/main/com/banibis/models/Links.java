package main.com.banibis.models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Links {
    @SerializedName("self")
    public Href self;
    @SerializedName("first")
    public Href first;
    @SerializedName("last")
    public Href last;
    @SerializedName("pdf")
    public Href pdf;
    @SerializedName("signature")
    public Href signature;
    @SerializedName("logo")
    public Logo logo;
}
