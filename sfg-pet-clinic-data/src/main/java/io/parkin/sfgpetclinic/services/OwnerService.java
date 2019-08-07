package io.parkin.sfgpetclinic.services;

import io.parkin.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lname);

}
