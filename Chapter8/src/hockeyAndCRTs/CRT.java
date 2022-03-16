/*

1) a has-a relationship describes a class containing another class while
an is-a relationship describes a class becoming an extension of an existing
class

2) go() and stop() will both be available

3) abstract methods will have nothing to start until acted upon from the derived class 
and have no default while overriding a method changes an attribute that already exists

4) an abstract class has more flexibility when it comes to non-final and non-static
variables while an interface can only have static and final variables. An interface
contains abstract methods but can not be inherited

6) 
	a) doThat() is a method that returns an int
	b) an interface
	c) because it is declared in Wo but needs to be implemented in a subclass
	d) doThis(), doThat(), doNow(), Roo(int z)
	e) Roo will override the method in Bo (returning 10 instead of 2)
	f) calls on the superclass constructor to define Roo just like Bo
	g) no, because it is overridden by the Roo class
	h) yes, you can call the doThis() method in the superclass with the command super.doThis()

*/