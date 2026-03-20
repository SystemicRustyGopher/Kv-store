package store

import "context"

// interface.go
// Purpose:
// - Defines the storage contract used by service layers.
// - Allows swapping SQLite with other backends in the future.
// - Keeps higher layers decoupled from concrete persistence details.

type KVStore interface {
	Put(ctx context.Context, key string, value []byte) error
	Get(ctx context.Context, key string) ([]byte, error)
	Delete(ctx context.Context, key string) error
	Exists(ctx context.Context, key string) (bool, error)
}
