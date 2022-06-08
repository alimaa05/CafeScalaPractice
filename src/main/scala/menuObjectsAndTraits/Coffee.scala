package menuObjectsAndTraits

object Coffee extends MenuItems {

  // object Coffee inherits from the trait 'MenuItems'
  // implementing any abstract method from the trait using keyword 'override'
  override val cost: BigDecimal = 1.0
  override val temp: Temperature.Value = Temperature.Hot
  override val name: String = "Coffee"
  override val vegetarian: Boolean = true
  override val vegan: Boolean = false
  override val foodType: FoodBeverage.Value = FoodBeverage.Beverage
  override val premiumItem: Boolean = false

}
