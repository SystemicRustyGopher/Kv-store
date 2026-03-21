package org.example.kvstore.service;

import java.util.List;
import java.util.Optional;
import org.example.kvstore.model.KvEntry;
import org.example.kvstore.repository.KvRepository;

public class KvService {
    private final KvRepository repository;

    public KvService(KvRepository repository) {
        this.repository = repository;
    }

    public Optional<KvEntry> get(String key) {
        // TODO(your-name): Add validation and domain-level error handling.
        return repository.get(key);
    }

    public void put(String key, String value) {
        // TODO(your-name): Add validation (empty key, size constraints, etc.).
        repository.put(key, value);
    }

    public boolean delete(String key) {
        // TODO(your-name): Decide behavior for missing keys.
        return repository.delete(key);
    }

    public List<KvEntry> list() {
        // TODO(your-name): Add optional pagination or prefix filters.
        return repository.list();
    }
}
