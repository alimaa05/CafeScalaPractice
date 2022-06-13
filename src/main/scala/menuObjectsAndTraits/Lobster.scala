package menuObjectsAndTraits

object Lobster extends MenuItems {

  override val cost: BigDecimal = 30.0
  override val temp: Temperature.Value = Temperature.Hot
  override val name: String = "Lobster"
  override val vegetarian: Boolean = false
  override val vegan: Boolean = false
  override val foodType: FoodBeverage.Value = FoodBeverage.Food
  override val premiumItem: Boolean = true

}
