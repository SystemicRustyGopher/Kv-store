package sqlite

// conn.go
// Purpose:
// - Owns creating and closing the SQLite DB connection.
// - Central place to configure connection options (file path, max open conns, timeouts).
// - Keeps connection bootstrap logic out of business/service layers.
