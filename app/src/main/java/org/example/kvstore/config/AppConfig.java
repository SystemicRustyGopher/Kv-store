package org.example.kvstore.config;

public class AppConfig {
    // TODO(your-name): Decide config source order
    // Suggested subsections:
    // - Environment variables (KV_DB_PATH, KV_PORT, etc.)
    // - Default values
    // - Validation (empty path, invalid URL)

    // TODO(your-name): Add fields you need, for example:
    // private final String databaseUrl;
    // private final int port;

    public AppConfig() {
        // TODO(your-name): Initialize fields.
    }

    public static AppConfig fromEnvironment() {
        // TODO(your-name): Read from System.getenv(...) and return AppConfig.
        return new AppConfig();
    }
}
