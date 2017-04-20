
class Exercise6 {
    static void main(String[] args) {
        println("TableByStep :")
        println tableByStep(3)

        println("\n TableByUpto :")
        println tableByUpto(3)

        println("\n TableByEach :")
        println tableByEach(3)
    }

    static List<Integer> tableByEach(Integer number) {
        List result = []
        (1..10).each { result.add(it * number) }
        result
    }

    static List<Integer> tableByUpto(Integer number) {
        List result = []
        1.upto(10, { result.add(it * number) })
        result
    }

    static List<Integer> tableByStep(Integer number) {
        List result = []
        1.step(11, 1, { result.add(it * number) })
        result
    }
}
