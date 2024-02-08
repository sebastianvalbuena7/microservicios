package com.sebastiandev.companiescrud.controllers;

import com.sebastiandev.companiescrud.entities.Company;
import com.sebastiandev.companiescrud.services.CompanyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@AllArgsConstructor
@RequestMapping("/company")
@Slf4j
@Tag(name = "Companies resources")
public class CompanyController {
    private final CompanyService companyService;

    @Operation(summary = "Get a company given a company name")
    @GetMapping("/{name}")
    public ResponseEntity<Company> get(@PathVariable String name) {
        log.info("GET: company {}", name);
        return ResponseEntity.ok(this.companyService.readByName(name));
    }

    @Operation(summary = "Post a company given a company from body")
    @PostMapping
    public ResponseEntity<Company> post(@RequestBody Company company) {
        log.info("POST: company {}", company.getName());

        return ResponseEntity
                .created(URI.create(this.companyService.create(company).getName())).build();
    }

    @Operation(summary = "Put a company given a company from body and a name")
    @PutMapping("/{name}")
    public ResponseEntity<Company> put(@RequestBody Company company, @PathVariable String name) {
        log.info("PUT: company {}", name);

        return ResponseEntity.ok(this.companyService.update(company, name));
    }

    @Operation(summary = "Delete a company given a company name")
    @DeleteMapping("/{name}")
    public ResponseEntity<?> delete(@PathVariable String name) {
        log.info("DELETE: company {}", name);

        this.companyService.delete(name);

        return ResponseEntity.noContent().build();
    }
}
