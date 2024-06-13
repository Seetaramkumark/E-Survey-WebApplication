<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%
    // Get form data from request
    String formName = request.getParameter("form-name");

    // Initialize CSV content
    StringBuilder csvContent = new StringBuilder();

    // Get question data
    String[] questions = request.getParameterValues("question");
    String[] answerTypes = request.getParameterValues("answer-type");

    // Add CSV headers
    csvContent.append("Form Name,Question,Answer Type,Answer\n");

    // Iterate through questions and answer types
    for (int i = 0; i < questions.length; i++) {
        String question = questions[i];
        String answerType = answerTypes[i];

        // Get answers based on answer type
        String[] answers = null;

        if (answerType.equals("choice")) {
            answers = request.getParameterValues("choice-" + (i + 1));
        } else if (answerType.equals("text")) {
            answers = new String[]{request.getParameter("text-answer-" + (i + 1))};
        }

        // Create CSV row
        String csvRow = String.join(",", Arrays.asList(formName, question, answerType, String.join(";", answers)));
        csvContent.append(csvRow).append("\n");
    }

    // Set the response headers for CSV file download
    response.setContentType("text/csv");
    response.setHeader("Content-Disposition", "attachment; filename=\"form_data.csv\"");

    // Write CSV content to response
    PrintWriter writer = response.getWriter();
    writer.write(csvContent.toString());
    writer.flush();
    writer.close();
%>
