package io.parkin.sfgpetclinic.services;

import io.parkin.sfgpetclinic.model.Vet;
import java.util.Set;

public interface VetService {
    Vet findByLastName(String lname);
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAall();
}
