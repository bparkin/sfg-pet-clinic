package io.parkin.sfgpetclinic.services;

import io.parkin.sfgpetclinic.model.Pet;

public interface PetService extends CrudService<Pet,Long>{

    Pet findByLastName(String lname);
}
