package com.github.sergioecnetto.citesapi.contries.Country.repository;

import com.github.sergioecnetto.citesapi.contries.Country.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRpository extends JpaRepository<Country, Long> {
}
