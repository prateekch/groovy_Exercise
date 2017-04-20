package Exercise4

class Person {
    private String name
    private Integer age
    private String address
    private String company
    private Integer empId
    private Double salary

    @Override
    String toString() {
        """${name} is a man aged ${age} who lives at ${address}
He works for ${company} with employee id ${empId} and draw ${salary} lots of money !!!!."""
    }
}