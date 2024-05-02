package com.klm.exercises.spring.locations;

import java.util.Collection;
import java.util.Locale;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository {

    Optional<Location> get(Locale locale, String key);

    Optional<Collection<Location>> find(Locale locale, String term);

    Collection<Location> list(Locale locale);

}
