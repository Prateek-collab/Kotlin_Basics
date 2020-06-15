fun main(){

    val a=3

    when(a){
        in 1..10->println("in range 1-10")
        in 11..20->println("in range 11-20")
        else ->println("not in range")
    }
}
