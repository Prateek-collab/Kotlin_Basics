fun main(){
    val List=listOf('+','-','*','/')
    for(i in List){
        val output=perform(100,20,i)
        println("The output for operation $i is $output")
    }
}

fun perform(a:Int,b:Int,Operator:Char):Int{
    var c=0
    if (Operator=='+'){
        c=a+b
    }
    if (Operator=='-'){
        c=a-b
    }
    if (Operator=='*'){
        c=a*b
    }
    if (Operator=='/'){
        c=a/b
    }
    else{
        c=0
    }
    return c
}
