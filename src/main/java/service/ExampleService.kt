package service

import model.Greeting
import javax.inject.Inject

class ExampleService @Inject constructor() {

  fun sayHi(name: String) = Greeting("Hi! $name")

}
