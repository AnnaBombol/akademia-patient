package akademia.devopsi.pl.zadaniedomowerejestracja;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
public class Patient {
    @NotEmpty
    private int id;
    @NotEmpty
    @Length(max = 20)
    private String name;
    @NotEmpty
    @Length(max = 20)
    private String surname;
    @NotEmpty
    @Length(min = 11, max = 11)
    private long pesel;
    @NotEmpty
    @Length(min = 9, max = 9)
    private int number;
    private String comments;

}
