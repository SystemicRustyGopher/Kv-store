package sqlite

// tx.go
// Purpose:
// - Wraps transaction helpers for multi-step atomic operations.
// - Provides consistent commit/rollback handling.
// - Useful for batch writes and compare-and-set style updates.
