package io.parkin.sfgpetclinic.services;

import io.parkin.sfgpetclinic.model.Pet;
import java.util.Set;

public interface PetService {

    Pet findByLastName(String lname);
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAall();

}
