package controller;

import domain.service.PatientService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class RequestHandler {

    protected PatientService service = PatientService.getInstance();

    public abstract String handleRequest (HttpServletRequest request, HttpServletResponse response);

    public void setModel (PatientService contactTracingService) {
        this.service = contactTracingService;
    }

    public PatientService getService() {
        return service;
    }

}
