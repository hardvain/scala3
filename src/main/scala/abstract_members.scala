/** Abstract Members
  *
  * * A member of a class or trait is abstract if the member does not have a
  * complete definition in the class and are expected to be implemented in the
  * subclasses
  *
  * Abstract members can be `vals`, `vars`, `methods` and `types`
  */
trait Abstract:
  /** * Represents an abstract type
    *
    * Classes themselves may be abstract, and traits are by definition abstract,
    * but neither of these are what are referred to as abstract types in Scala.
    * An abstract type in Scala is always a member of some class or trait, such
    * as type T in trait Abstract.
    */
  type T

  /** * Represents an abstract method
    */
  def transform(x: T): T

  /** * Represents an abstract val
    */
  val initial: T

  /** * Represents an abstract var
    */
  var current: T

class Concrete extends Abstract:
  /** * Defining a concrete type like this can be considered as a type alias.
    * Within `Concrete` class, the value of `T` will always be `String`
    *
    * When an abstract type member has a concrete type mentioned for it, it
    * becomes a concrete type
    */
  type T = String
  def transform(x: String) = x + x
  val initial = "hi"
  var current = initial
