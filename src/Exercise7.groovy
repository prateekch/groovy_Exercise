class Exercise7 {
   def check={List list,def value-> list.contains(value)}

    public static void main(String[] args) {
        Exercise7 exercise7=new Exercise7()
        println exercise7.check([1,2,3,4,5],2)
        println exercise7.check([1,2,3,'a',2.5],2.8)

    }
}
