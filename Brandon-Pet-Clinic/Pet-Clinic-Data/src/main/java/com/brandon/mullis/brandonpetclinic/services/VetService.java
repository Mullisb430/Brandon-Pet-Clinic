package com.brandon.mullis.brandonpetclinic.services;

import com.brandon.mullis.brandonpetclinic.model.Vet;

import java.util.Set;

public interface VetService
{


    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
