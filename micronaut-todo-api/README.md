# Requirements

This api must be backed by a postgresql database.

> Please make sure to correctly defines those environment variables.

```
JDBC_URL=jdbc:postgresql://<domain>:<port>/<database>
JDBC_USER=<login>
JDBC_PASSWORD=<password>
```
# Routes

## POST /todos
create a todo

## GET /todos/{id}
get a todo by id

## GET /todos
list all todos
