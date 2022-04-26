package akademia.devopsi.pl.zadaniedomowerejestracja;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PatientService {

    private final Map<Integer, Patient> patients;
    private PatientService() { this.patients = new HashMap<>();}

    public void addPatient(Patient patient){
        patient.setId(this.patients.size()+1);
        this.patients.put(patient.getId(), patient);
    }

    // public Patient map(PatientCreateDto dto){
    //    return new Patient(dto.getId(), dto.getName(), dto.getSurname(), dto.getPesel());
    //}

    public void updatePatient(int id, Patient patient){
        if(this.patients.containsKey(patient.getId())){
            this.patients.put(patient.getId(), patient);
        }
    }

    public void deletePatient(int id){
        this.patients.remove(id);
    }

    public List<Patient> getPatients(){

        List<Patient> tmpPatients = new ArrayList<>();
        for(int id:this.patients.keySet()){
            tmpPatients.add(this.patients.get(id));
        }
        return tmpPatients;
    }

}
