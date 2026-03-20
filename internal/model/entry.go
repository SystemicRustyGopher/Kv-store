package model

import "time"

// entry.go
// Purpose:
// - Defines core domain model(s) for key/value records.
// - Shared shape used across store, service, and API layers.

type Entry struct {
	Key       string
	Value     []byte
	CreatedAt time.Time
	UpdatedAt time.Time
}
