package akademia.devopsi.pl.zadaniedomowerejestracja;

import com.fasterxml.jackson.annotation.JacksonInject;
import io.swagger.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/registration")
@Validated
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService){this.patientService = patientService;}

    @PostMapping("/patients")
    public ResponseEntity<Void> addPatient(@RequestBody Patient patient ){
        this.patientService.addPatient(patient);
        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }
    @PutMapping("/patients/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable @Min(1) int id, @RequestBody Patient patient){
        this.patientService.updatePatient(id,patient);
        return ResponseEntity.status(HttpStatus.OK)
                .body(patient);
    }
    @DeleteMapping("/patients/{id}")
    public ResponseEntity<Patient> deletePatient(@PathVariable int id){
        this.patientService.deletePatient(id);
        return ResponseEntity.status(HttpStatus.OK)
                .build();
    }
    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> getPatients(){
        List<Patient> patients = this.patientService.getPatients();
        return ResponseEntity.status(HttpStatus.OK)
                .body(patients);
    }


}
