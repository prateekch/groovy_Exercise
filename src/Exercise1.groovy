import com.ttn.java.Exercise.Person
import groovy.transform.ToString

class Exercise1 {
    public static void main(String[] args) {

        Person person=new Person(name: "Prateek",age: 22,gender: "male",address: "Noida")

        println("name : "+person.getName()+" age :"+person.getAge()+" gender :"+person.getGender()+" address :"+person.getAddress())

        println("name : "+person.name+" age :"+person.age+" gender :"+person.gender+" address :"+person.address)


    }
}

