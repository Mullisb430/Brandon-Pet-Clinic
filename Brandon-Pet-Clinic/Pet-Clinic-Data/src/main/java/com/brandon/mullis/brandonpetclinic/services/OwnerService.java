package com.brandon.mullis.brandonpetclinic.services;

import com.brandon.mullis.brandonpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService
{
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
