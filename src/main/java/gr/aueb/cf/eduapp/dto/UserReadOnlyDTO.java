//package gr.aueb.cf.eduapp.dto;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//public class UserReadOnlyDTO {
//    private String firstname;
//    private String lastname;
//    private String vat;
//}
package gr.aueb.cf.eduapp.dto;

import lombok.Builder;

@Builder
public record UserReadOnlyDTO(String firstname, String lastname, String vat) {}