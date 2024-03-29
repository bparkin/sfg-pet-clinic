package io.parkin.sfgpetclinic.services.map;

import io.parkin.sfgpetclinic.model.Vet;
import io.parkin.sfgpetclinic.services.CrudService;
import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
         super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);

    }
}
