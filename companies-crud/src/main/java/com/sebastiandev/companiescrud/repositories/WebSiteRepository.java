package com.sebastiandev.companiescrud.repositories;

import com.sebastiandev.companiescrud.entities.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebSiteRepository extends JpaRepository<WebSite, Long> {
}
