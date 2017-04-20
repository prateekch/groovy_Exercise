package Exercise8

class Exercise8 {
    public static void main(String[] args) {
        String projectpath = "/home/prateek/groovy_Exercise/"
        new File(projectpath, "src/Exercise8/File3").text =
                new File(projectpath, "src/Exercise8/File1").text.concat(new File(projectpath, "src/Exercise8/File2").text)

    }
}

