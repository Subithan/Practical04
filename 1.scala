object InventoryManagement{
    var itemNames:Array[String]=Array("Apple","Banana","Orange")
    var itemQuanities:Array[Int]=Array(10,20,30)

    def displayInventory():Unit={
        println("Inventory : ")
        for(i<-itemNames.indices){
            println(itemNames(i)+" : "+itemQuanities(i))
        }
    }

    def restockItem(itemName:String,quanity:Int):Unit={
        val index=itemNames.indexOf(itemName)
        if(index>=0){
            itemQuanities(index)+=quanity
            println("Restocked "+itemName+". New quanity: "+itemQuanities(index))
        }else{
            println("Item "+itemName+"does not exist in the inventory.")
        }
    }

    def sellItem(itemName:String,quanity:Int):Unit={
        val index=itemNames.indexOf(itemName)
        if(index>=0){
            if(itemQuanities(index)>=quanity){
                itemQuanities(index)-=quanity
                println("Sold "+quanity+" of "+itemName+". Remaining quanity : "+itemQuanities(index))
            }else{
                println("Not enough "+itemName+" in stock to sell. available quanity : "+itemQuanities(index))
            }
        }else{
            println("Item "+itemName+" does not exist in the inventory.")
        }
    }

    def main(args:Array [String]):Unit={
        displayInventory()
        restockItem("Apple",5)
        sellItem("Banana",15)
        sellItem("Orange",40)
        displayInventory()
    }
}