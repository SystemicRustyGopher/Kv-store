package org.example.kvstore.repository;

import java.util.List;
import java.util.Optional;
import org.example.kvstore.db.SqliteConnectionFactory;
import org.example.kvstore.model.KvEntry;

public class SqliteKvRepository implements KvRepository {
    private final SqliteConnectionFactory connectionFactory;

    public SqliteKvRepository(SqliteConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
    public Optional<KvEntry> get(String key) {
        // TODO(your-name):
        // SELECT key, value, updated_at FROM kv_store WHERE key = ?
        throw new UnsupportedOperationException("TODO: implement get");
    }

    @Override
    public void put(String key, String value) {
        // TODO(your-name):
        // INSERT ... ON CONFLICT(key) DO UPDATE ...
        throw new UnsupportedOperationException("TODO: implement put");
    }

    @Override
    public boolean delete(String key) {
        // TODO(your-name):
        // DELETE FROM kv_store WHERE key = ?
        throw new UnsupportedOperationException("TODO: implement delete");
    }

    @Override
    public List<KvEntry> list() {
        // TODO(your-name):
        // SELECT key, value, updated_at FROM kv_store ORDER BY key
        throw new UnsupportedOperationException("TODO: implement list");
    }
}
