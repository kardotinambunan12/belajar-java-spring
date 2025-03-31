package belajar_restful.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateAddressRequest {

    @JsonIgnore
    @NotBlank
    private String contactId;

    private String street;

    private String city;

    private String province;

    @NotBlank
    private String country;

    private String postalCode;


}
