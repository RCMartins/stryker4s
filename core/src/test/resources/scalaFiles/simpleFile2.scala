object Foo {
  def bar = 15 > 14
  val foo = (new scala.util.Random).nextInt(3) + 1
  def foobar = s"${bar}foo"
  def barfoo = s"$$0"
}
