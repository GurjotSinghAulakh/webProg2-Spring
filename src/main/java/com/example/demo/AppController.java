package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AppController {
    ArrayList<BestillingAvBilletter> bestillingArray = new ArrayList<>();

    @PostMapping("/lagredata")
    public void registrerBilletter(BestillingAvBilletter objPerson){
        bestillingArray.add(objPerson);
    }

    @GetMapping("/hentdata")
    public ArrayList<BestillingAvBilletter> hentAlle() {
        return bestillingArray;
    }

    @GetMapping("/slettdata")
    public void sletterData(){
        bestillingArray.clear();
    }

}
