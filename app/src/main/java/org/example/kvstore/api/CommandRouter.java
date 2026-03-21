package org.example.kvstore.api;

import org.example.kvstore.service.KvService;

public class CommandRouter {
    private final KvService service;

    public CommandRouter(KvService service) {
        this.service = service;
    }

    public void run(String[] args) {
        // TODO(your-name):
        // Parse and dispatch commands, for example:
        // - put <key> <value>
        // - get <key>
        // - delete <key>
        // - list
        // Also decide on:
        // - usage/help output
        // - exit codes
        // - structured error messages
        throw new UnsupportedOperationException("TODO: implement command routing");
    }
}
