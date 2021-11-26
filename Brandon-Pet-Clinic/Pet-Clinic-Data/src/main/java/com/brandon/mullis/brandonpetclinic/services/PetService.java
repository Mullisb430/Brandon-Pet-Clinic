package com.brandon.mullis.brandonpetclinic.services;

import com.brandon.mullis.brandonpetclinic.model.Pet;

import java.util.Set;

public interface PetService
{

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
