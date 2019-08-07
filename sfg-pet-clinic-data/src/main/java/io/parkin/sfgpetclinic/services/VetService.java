package io.parkin.sfgpetclinic.services;

import io.parkin.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet,Long>{
    Vet findByLastName(String lname);
}
