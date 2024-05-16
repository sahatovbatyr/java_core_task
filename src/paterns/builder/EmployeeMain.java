package paterns.builder;

// https://habr.com/ru/companies/otus/articles/552412/

//Паттерн проектирования Builder разработан для обеспечения гибкого решения различных
//задач создания объектов в объектно-ориентированном программировании.

//Паттерн проектирования Builder позволяет отделить построение сложного объекта от его представления.

//Паттерн Builder создает сложные объекты, используя простые объекты и поэтапный подход.

//Паттерн предоставляет один из лучших способов создания сложных объектов.

//Это один из паттернов проектирования банды четырех (GoF), которые описывают,
//как решать периодически возникающие задачи проектирования в объектно-ориентированном программном обеспечении.

//Этот паттерн полезен для создания разных иммутабельных объектов с помощью одного и того же
//процесса построения объекта.

public class EmployeeMain {

    public static void main(String[] args) {
        Employee emp1 = new Employee.EmployeeBuilder().empNo(100).name("Brijesh").projectName("Builder Pattern")
                .build();


        System.out.println(emp1);
    }
}