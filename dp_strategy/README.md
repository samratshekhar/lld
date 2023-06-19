## Strategy design pattern 

There arise a situation where due to class extension, multiple childs of same parent class can have duplicate code for overriden methods. In this case, Strategy design pattern can be used to cleanup duplication.

Eg. 
Vehice -> drive(), capacity()
Vehicle -> SUV, MUV, Hatch

SUV -> drive("anywhere"), capacity(4)
MUV -> drive("road"), capacity(7)
Hatch -> drive("road"), capacity(4)

To reduce above duplication of method overriding, define common strategies. Here, drive and seating are two common strategies. Add these strategies to Vehicle class and allow each child class to instantiate their choice of strategy during object creation.
