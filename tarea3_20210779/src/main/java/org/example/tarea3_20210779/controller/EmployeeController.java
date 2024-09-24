package org.example.tarea3_20210779.controller;
//para usar el REPOSITORIO EMPLOYEE
import org.example.tarea3_20210779.repository.EmployeeRepository;
//para usar la ENTIDAD EMPLOYEE
import org.example.tarea3_20210779.entity.Employee;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/employee") //es decir todas las rutas empiezan con employee, ES GENERAL
public class EmployeeController {
    //siempre que se crea un repositorio, en su controlador debe haber:
    //un atributo final:
    final EmployeeRepository employeeRepository;
    //y su contructor
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //ya que tenemos el repositorio ahora si podemos sacar informacion de la base de datos.

    @GetMapping("/listar") //obtiene la lista y la manda a la vista
    public String getEmployees(Model model) {
        // Obtén la lista de empleados desde la base de datos
        //aca se usa el THIS EMPLOYEE.REPOSITORY (constructor)
        List<Employee> employees = employeeRepository.findAll();

        // Pasa la lista de empleados al modelo para que esté disponible en la vista
        model.addAttribute("employees", employees);

        // Retorna el nombre del archivo HTML que se encargará de mostrar la lista
        return "Employee/lista_empleados";
    }

    @PostMapping("/new")
    public String createEmployees(Model model) {
        //aca debe ir el codigo de como crear employees

        return "Employee/nuevo_empleado";
    }


}