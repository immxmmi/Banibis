package main.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Links{
    public Self self;
    public First first;
    public Last last;
    public Pdf pdf;
    public Logo logo;
    public Signature signature;
}
