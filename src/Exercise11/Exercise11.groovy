package Exercise11
class Exercise11 {
    static void main(String[] args) {

        File source = new File("/home/prateek/groovy_Exercise/src/Exercise11/image.jpg")
        File destination = new File("/home/prateek/groovy_Exercise/src/Exercise11/newimage.jpg")
        copyImageFile(source, destination)
    }

    static void copyImageFile(File source, File destination) {
        destination.bytes = source.bytes
    }
}