package endpoint

import com.google.api.server.spi.config.Api
import com.google.api.server.spi.config.ApiMethod
import di.DaggerInjector
import model.Greeting
import service.ExampleService
import javax.inject.Inject
import javax.inject.Named

/**
 * Base Endpoint to hold common methods across all endpoints
 *
 * Created by jduran on 26/02/17.
 */
@Api(name = "kotlin", version = "v1")
class ExampleEndpoint {

  init {
    DaggerInjector.builder().build().inject(this)
  }

  @Inject lateinit var exampleService: ExampleService

  @ApiMethod(name = "sayHi",
      httpMethod = ApiMethod.HttpMethod.GET,
      path = "greetings/{name}")
  fun sayHi(@Named("name") name: String): Greeting = exampleService.sayHi(name)
}
