name := "root"

scalaVersion := "2.12.4"
lazy val a = project.in(file("a"))
lazy val b = project.in(file("b"))

// test.in(Compile) := {}
// test := {test.in(a).value}
