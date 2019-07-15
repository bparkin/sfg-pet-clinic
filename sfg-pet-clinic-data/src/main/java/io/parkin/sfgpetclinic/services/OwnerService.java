package io.parkin.sfgpetclinic.services;

import io.parkin.sfgpetclinic.model.Owner;
import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lname);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAall();
}
