package di

import dagger.Component
import endpoint.ExampleEndpoint
import javax.inject.Singleton

@Singleton
@Component()
interface Injector {

  fun inject(exampleEndpoint: ExampleEndpoint)
}
