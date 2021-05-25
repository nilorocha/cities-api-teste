package com.github.nilorocha.citiesapi.countries.repository;

import com.github.nilorocha.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
