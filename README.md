# flyway-postgres-concurrent-index-issue
Minimal example of the issue described in https://github.com/flyway/flyway/issues/3508

### Run the example

```shell
> docker-compose -f docker-compose/postgres.yml up -d
> sbt run
> docker-compose -f docker-compose/postgres.yml down
```
