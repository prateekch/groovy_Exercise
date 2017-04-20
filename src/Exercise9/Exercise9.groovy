package Exercise9

class Exercise9 {
    public static void main(String[] args) {
        def counter=0
        def text=""
        new File("/home/prateek/groovy_Exercise/src/Exercise9/File1").eachLine { line ->
            counter++
            if(counter %2!=0){
                text=text+line+"\n"
             }
    }
        new File('/home/prateek/groovy_Exercise/src/Exercise9/File2').text  = text
    }
}
