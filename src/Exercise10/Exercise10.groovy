package Exercise10

class Exercise10 {

    public static String removespace(String text){
        text.replaceAll('\\s',"")
    }
    public static void main(String[] args) {
       def text=  new File("/home/prateek/groovy_Exercise/src/Exercise10/withWhiteSpace").text
        new File('/home/prateek/groovy_Exercise/src/Exercise10/withoutWhiteSpace').text  = removespace(text)
    }
    }

