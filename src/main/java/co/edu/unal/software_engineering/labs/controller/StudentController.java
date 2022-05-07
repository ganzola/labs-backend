package co.edu.unal.software_engineering.labs.controller;

import co.edu.unal.software_engineering.labs.model.*;
import co.edu.unal.software_engineering.labs.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private AssociationService associationService;

    private UserService userService;

    private CourseService courseService;

    private PeriodService periodService;

    private RoleService roleService;


    public StudentController(UserService userService, CourseService courseService, PeriodService periodService, AssociationService associationService, RoleService roleService) {
        this.userService = userService;
        this.courseService = courseService;
        this.periodService = periodService;
        this.associationService = associationService;
        this.roleService = roleService;
    }


    @PostMapping(value = {"/estudiante/inscribir/periodo/{periodId}/curso/{courseId}"})
    public ResponseEntity<Void> associateStudent(@PathVariable Integer periodId, @PathVariable Integer courseId) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User student = userService.findByUsername(username);
        Course course = courseService.findById(courseId);
        Period period = periodService.findById(periodId);
        Role role = roleService.findById(Role.ROLE_STUDENT);

        if (course == null || period == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        associationService.associate(student, role, course, period);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}