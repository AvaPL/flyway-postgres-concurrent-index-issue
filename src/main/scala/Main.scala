import com.zaxxer.hikari.HikariDataSource
import org.flywaydb.core.Flyway

object Main extends App {
  val dataSource = new HikariDataSource
  dataSource.setDriverClassName("org.postgresql.Driver")
  dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/example")
  dataSource.setUsername("postgres")
  dataSource.setPassword("example")

  val flyway = Flyway
    .configure()
    .dataSource(dataSource)
    .load()

  flyway.migrate()
}
