package menuObjectsAndTraits

trait MenuItems {

  // trait become useful as generic types and with abstract methods
  // extending the trait requires implementation of the methods e.g. cost, temp etc.
  // use 'extends' keyword to extend trait - then implement any abstract method of the trait using the 'override' keyword
  // scala traits can't be instantiated and have no arguments or parameters BUT can be inherited using classes and objects
  val cost: BigDecimal
  val temp: Temperature.Value
  val name: String
  val vegetarian: Boolean
  val vegan: Boolean
  val foodType: FoodBeverage.Value
  val premiumItem: Boolean

  // where a trait is required, a subtype of the trait can be used instead
  // traits have abstract fields which can be implemented by a class constructor
  // on the last line you need to call the trait.abstractmethod must be implemented in any subtype of said trait

}
