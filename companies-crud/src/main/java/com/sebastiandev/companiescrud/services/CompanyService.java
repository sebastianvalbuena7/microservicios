package com.sebastiandev.companiescrud.services;

import com.sebastiandev.companiescrud.entities.Company;

public interface CompanyService {
    Company readByName(String name);
    Company create(Company company);
    Company update(Company company, String name);
    void delete(String name);
}
