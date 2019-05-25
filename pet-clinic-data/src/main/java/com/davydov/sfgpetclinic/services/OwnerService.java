package com.davydov.sfgpetclinic.services;

import com.davydov.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
