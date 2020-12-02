package controller;

import domain.model.Patient;
import domain.service.PatientService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;

public class Register extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        String ssn = request.getParameter("ssn");
        String gender = request.getParameter("gender");
        int weight = Integer.parseInt(request.getParameter("weight"));
        int length = Integer.parseInt(request.getParameter("length"));
        Patient patient = new Patient(ssn, LocalDate.now(), gender, length, weight);
        service.add(patient);
        return "index.jsp";
    }
}
