package com.davydov.sfgpetclinic.repositories;

import com.davydov.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
