package Exercise2

class Exercise2{
    public static void main(String[] args) {
        def subPerson=new SubPerson(name: "Prateek",age: 22,gender: "male",address: "Noida", empId: 2605,company: "TTN",salary: 15000)

        println "BY GETTER --"+ subPerson.getName()+" "+subPerson.getAge()+" " + " "+subPerson.gender+ " " +
                ""+subPerson.getAddress()+" " +subPerson.getEmpId()+" "+subPerson.getCompany()+" "+subPerson.getSalary()

        println "By dot Operator-- "+subPerson.name+" "+subPerson.age+" "+subPerson.gender+" "+subPerson.address+" " +
                ""+subPerson.empId+" "+subPerson.company+" "+subPerson.salary

        println "By @operator -- ${subPerson.@empId} ${subPerson.@company} ${subPerson.@salary}"
    }
}
