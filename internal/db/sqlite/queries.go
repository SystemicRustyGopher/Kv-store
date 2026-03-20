package sqlite

// queries.go
// Purpose:
// - Holds SQL statements and small query helpers for KV operations.
// - Typical operations: Put (upsert), Get by key, Delete by key, List by prefix.
// - Separates SQL text from higher-level store/service logic.
