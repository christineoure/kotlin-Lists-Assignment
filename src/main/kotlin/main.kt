fun main(){
    even(listOf("0","1","2","3","4","5","6","16","20","24","10","8"))
    Height(listOf(4,7,7,8,9,34))
    var Allan=Person("Russel",25,30,75)
    var Dylan=Person("Jeff",27,68,80)
    var Ethan=Person("Hugh",35,56,65)
    var mylist=  mutableListOf(Allan,Dylan)
    var sorted=mylist.sortedByDescending { data->data.age }
    println(sorted)

    var nexxt=Person("Santana",42,5,83)
    var individual=Person("Misanta",39,7,75)
    var nexxtlist= listOf(nexxt,individual)
    var takeall=more(mylist.plus(nexxtlist))
    println(takeall)

    var Audi= Carobjec("KCJ 524C",400)
    var Rollex=Carobjec("KCU 508Y",500)
    var assets= listOf(Audi,Rollex)
    var x=carobjects(listOf(Audi,Rollex))
    println(x)
}
fun even(nums:List<String>):List<String>{
    nums.forEachIndexed { index, first ->
        if (index%2==0){
            println(first)
        }
    }
    return nums

}

fun Height(height:List<Int>):String{
    var meterHeight=height.sum()
    var averageHeight= height.average()
    var total=("sum is $meterHeight and avarage is $averageHeight")
    println(total)

    return  total
}
data class Person(var name:String,var age:Int,var height: Int,var weight:Int)
fun more(plus:List<Person>){
}
data class Carobjec(var registration:String,var mileage:Int)
fun carobjects(obj:List<Carobjec>):Double{
    var y=0.0
    obj.forEach { p->
        y+=p.mileage

    }

    return y/obj.count()

}
