package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientDetails extends RequestHandler{
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        String ssn = request.getParameter("ssn");
        request.setAttribute("patient", service.getPatientWitSSN(ssn));
        System.out.println(service.getPatientWitSSN(ssn).getLastExamination().getExaminationDate());
        request.setAttribute("lastExaminationDate", service.getPatientWitSSN(ssn).getLastExamination().getExaminationDate());
        request.setAttribute("bmi", service.getPatientWitSSN(ssn).getBMI());
        return "patient.jsp";
    }
}
