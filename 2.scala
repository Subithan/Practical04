object NumberClassifier{
    def main(args:Array[String]):Unit={
        if(args.length!=1){
            println("Please provide exactly one integer as an argument")
        }else{
            try{
                val input=args(0).toInt
                classifyNumber(input)
            }catch{
                case _:NumberFormatException=>println("Please provide a valid integer.")
            }
        }
    }

    def classifyNumber(number:Int):Unit={
        number match{
            case n if n<=0 =>println("Negative/Zero is input")
            case n if n%2==0 => println("Even number is given")
            case _=>println("Odd numbner is given")
        }
    }
}