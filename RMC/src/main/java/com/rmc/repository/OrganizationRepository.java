package com.rmc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rmc.beans.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Integer> {

}
