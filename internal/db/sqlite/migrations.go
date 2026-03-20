package sqlite

// migrations.go
// Purpose:
// - Runs schema migrations for the KV store.
// - Ensures database schema is initialized/updated before reads and writes.
// - Tracks migration versioning strategy used by the project.
