package org.example.kvstore.db;

import org.example.kvstore.config.AppConfig;

public class SqliteConnectionFactory {
    // TODO(your-name): Store validated DB URL from AppConfig.
    private final AppConfig config;

    public SqliteConnectionFactory(AppConfig config) {
        this.config = config;
    }

    public AppConfig getConfig() {
        return config;
    }

    // TODO(your-name):
    // 1) Add openConnection() that returns java.sql.Connection
    // 2) Handle SQLException with clear error context
    // 3) Optionally configure SQLite pragmas (journal_mode, busy_timeout, foreign_keys)
}
