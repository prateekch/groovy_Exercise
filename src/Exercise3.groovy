class Exercise3 {
    public static void main(String[] args) {
        def i=0
        def x
        4.times {
           x= Math.pow(2,i++)
             x.times {
                 print "*"
             }
            println ""
        }

    }
}
