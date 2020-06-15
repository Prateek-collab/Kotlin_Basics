//immutable list store static info in a program
fun main(){
    val listStrings=listOf("box","table","chair")

    println(listStrings)

    println(listStrings.indexOf("table"))

    //mutable lists are declared using mutableListOf function
    val listOfStrings= mutableListOf("Box","Table","Chair")

    listOfStrings[1]="Bed"
    listOfStrings.add("TV")

    //to add element at a particular index
    listOfStrings.add(2,"Air conditioner")

    //delete using removeAt func.
    listOfStrings.removeAt(3)

    //to insert an entire list or array
    val arr=arrayOf("Fan","Lights","Mattress")
    println(listOfStrings.addAll(arr))
}

//Another list derived from java is the array list
//Syntax:var/val listName=arrayListOf<datatype>(list_of_items)