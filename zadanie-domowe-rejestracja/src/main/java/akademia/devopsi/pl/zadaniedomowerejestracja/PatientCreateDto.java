package akademia.devopsi.pl.zadaniedomowerejestracja;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
public class PatientCreateDto {
    private int id;
    private String name;
    private String surname;
    private long pesel;

}
