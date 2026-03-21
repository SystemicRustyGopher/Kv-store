package org.example.kvstore.db;

public class SchemaInitializer {
    // TODO(your-name): Keep migration locations/versioning strategy here.
    private final SqliteConnectionFactory connectionFactory;

    public SchemaInitializer(SqliteConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public void initialize() {
        // TODO(your-name):
        // 1) Load SQL migration file(s) from resources
        // 2) Execute schema creation with a DB connection
        // 3) Make this idempotent (safe on repeated app starts)
        // 4) Add startup logging for migration status
        throw new UnsupportedOperationException("TODO: implement schema initialization");
    }
}
