package menuObjectsAndTraits

// case class is regular class with some differences
// good for modeling immutable data

// minimal case class needs 'case class' keyword', an identifier and parameter list (that could be empty)

// the keyword 'new' wasn't used to instantiate the Employee case class
// bec case classes have an apply method by default - takes care of object construction

// case classes with parameters are public vals
// can't reassign bec its a val i.e. immutable - using var is discouraged
case class Employee(
                   val name: String,
                   val positionTitle: String
                   )

// instances of case classes are compared by structure and not reference
// even if two instances of employee refer to diff objects, the value of each is equal

// you can create a copy of an instance of case class by using the 'copy' method - or you can change the constructor arguments