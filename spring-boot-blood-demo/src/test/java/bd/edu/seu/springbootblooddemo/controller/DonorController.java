package bd.edu.seu.springbootblooddemo.controller;

import bd.edu.seu.springbootblooddemo.model.donor;
import bd.edu.seu.springbootblooddemo.repository.DonorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.CompositeUriComponentsContributor;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/donors")
public class DonorController {
    private DonorRepository donorRepository;
    private List<donor> donorList;

    public DonorController(){
        donorList = new ArrayList<>();
        donorList.add (new donor(2, "Aftab", "Dhaka", "01756******"));
        donorList.add (new donor(3, "Uddin", "Dhaka", "01756******"));
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<donor>>findAll(){
        return ResponseEntity.ok(donorList);
    }

    @PostMapping(value = "")
    public ResponseEntity<donor> save(donor don){
        donorList.add(don);
        return ResponseEntity.created(null).body(don);
    }


}
