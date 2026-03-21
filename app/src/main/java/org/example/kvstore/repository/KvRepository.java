package org.example.kvstore.repository;

import java.util.List;
import java.util.Optional;
import org.example.kvstore.model.KvEntry;

public interface KvRepository {
    // TODO(your-name): Add method-level docs about expected behavior.
    // Example: should get() return empty for missing keys or throw?

    Optional<KvEntry> get(String key);

    void put(String key, String value);

    boolean delete(String key);

    List<KvEntry> list();
}
