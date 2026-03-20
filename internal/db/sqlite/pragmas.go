package sqlite

// pragmas.go
// Purpose:
// - Applies SQLite PRAGMA settings after opening a connection.
// - Keeps durability/performance choices explicit (journal_mode, synchronous, foreign_keys, busy_timeout).
// - Makes environment-specific tuning easy (dev vs prod).
