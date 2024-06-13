<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Survey Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin:auto;
            margin-top: 50px;
        }

        .form-builder {
            max-width: 600px;
            margin: 0 auto;
            padding: 40px;
            background: #e0e1cf;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .form-builder h2 {
            text-align:justify;
        }

        .form-builder label {
            display: block;
            margin-bottom: 10px;
        }

        .form-builder input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .form-builder .add-question-button {
            background-color: #4cadaf;
            color: white;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin-top: 10px;
            cursor: pointer;
        }

        .delete-question-button {
            background-color: #e74c3c;
            color: white;
            border: none;
            padding: 5px 10px;
            font-size: 14px;
            margin-top: 10px;
            cursor: pointer;
        }

        .create-form-button {
            background-color: #4cadaf;
            color: white;
            border: none;
            padding: 20px 40px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 24px;
            margin-top: 40px;
            cursor: pointer;
            border-radius: 10px;
            display: block;
            margin: 0 auto;
        }
        .alert {
    background-color: #ffcccb; /* Set the background color */
    color: #8b0000; /* Set the text color */
    border: 1px solid #8b0000; /* Set the border color */
    padding: 10px; /* Add some padding for better appearance */
    border-radius: 5px; /* Add rounded corners */
    font-size: 16px; /* Set the font size */
}
        
        
    </style>
</head>
<body>
    <div class="form-builder">
        <form id="form" action="processForm.jsp" method="post">
            <h1><label for="form-name">Lets Create Our Own Survey Form</label></h1>
            <label for="form-name">Form Name:</label>
            <input type="text" name="form-name" required><br><br>
            <div id="question-container"></div>
            <button type="button" class="add-question-button" id="add-question">Add a new question</button><br><br><br>
            <input type="submit" class="create-form-button" value="Create Form" style="display: block; margin: 0 auto;">
        </form>
    </div>

    <div id="success-message" style="display: none; text-align: center; color: green; font-weight: bold; font-size: 20px; margin-top: 20px;">
        Form created successfully!
    </div>
    
    <script>
        document.addEventListener('DOMContentLoaded', function() {
            const form = document.getElementById('form');
            const questionContainer = document.getElementById('question-container');
            const addQuestionButton = document.getElementById('add-question');
            const successMessage = document.getElementById('success-message');

            addQuestionButton.addEventListener('click', function() {
                const questionDiv = document.createElement('div');
                questionDiv.className = 'question';
                questionDiv.innerHTML = `
                    <label for="question">Enter your question:</label>
                    <input type="text" name="question" required>
                    <label for="answer-type">Select answer type:</label>
                    <select name="answer-type">
                        <option value="choice">Multiple Choice</option>
                        <option value="text">Text</option>
                    </select>
                    <div class="text-input" style="display: none;">
                        <label for="text-answer">Text Answer:</label>
                        <input type="text" name="text-answer">
                    </div>
                    <div class="answer-options" style="display: none;">
                        <label for="num-choices">Number of Choices (if multiple choice):</label>
                        <input type="number" name="num-choices" min="1">
                    </div>
                    <button type="button" class="delete-question-button">Delete Question</button>
                `;

                questionContainer.appendChild(questionDiv);

                const answerType = questionDiv.querySelector('select[name="answer-type"]');
                const answerOptions = questionDiv.querySelector('.answer-options');
                const numChoicesInput = questionDiv.querySelector('input[name="num-choices"]');
                const textInput = questionDiv.querySelector('.text-input');

                answerType.addEventListener('change', function() {
                    if (answerType.value === 'text') {
                        answerOptions.style.display = 'none';
                        textInput.style.display = 'block';
                        numChoicesInput.value = '';
                        removeChoiceInputs(questionDiv);
                    } else {
                        answerOptions.style.display = 'block';
                        textInput.style.display = 'none';
                        textInput.querySelector('input[name="text-answer"]').value = '';
                    }
                });

                numChoicesInput.addEventListener('input', function() {
                    const numChoices = parseInt(numChoicesInput.value);
                    if (!isNaN(numChoices) && numChoices > 0) {
                        createChoiceInputs(questionDiv, numChoices);
                    } else {
                        removeChoiceInputs(questionDiv);
                    }
                });

                const deleteButton = questionDiv.querySelector('.delete-question-button');
                deleteButton.addEventListener('click', function() {
                    questionDiv.parentNode.removeChild(questionDiv);
                });
            });

            form.addEventListener('submit', function() {
            alert('Form created successfully!');
          });

        });
        document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('form');
    const questionContainer = document.getElementById('question-container');
    const addQuestionButton = document.getElementById('add-question');
    const successMessage = document.getElementById('success-message');

    addQuestionButton.addEventListener('click', function() {
        // ... (existing code for adding questions)
    });

    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Prevents the form from submitting normally

        // Assuming the form is successfully submitted
        successMessage.style.display = 'block';

        // Delay the alert slightly to allow the success message to show first
        window.setTimeout(function() {
            alert('Form created successfully!');
            window.location.href = 'index.html';
        }, 100);
    });

    // ... (existing functions for creating/removing choice inputs)
});
       
        document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('form');
    const questionContainer = document.getElementById('question-container');
    const addQuestionButton = document.getElementById('add-question');
    const successMessage = document.getElementById('success-message');

    // ... (existing code for adding questions)

    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Prevents the form from submitting normally

        // Assuming the form is successfully submitted
        successMessage.style.display = 'block';

        // Prepare form data for submission
        const formData = new FormData(form);

        // Send form data to Responces.jsp
        const xhr = new XMLHttpRequest();
        xhr.open('POST', 'Responces.jsp', true);
        xhr.onreadystatechange = function() {
            if (xhr.readyState === XMLHttpRequest.DONE) {
                if (xhr.status === 200) {
                    console.log('Form data sent successfully to Responces.jsp');
                } else {
                    console.error('Error sending form data to Responces.jsp');
                }
            }
        };
        xhr.send(formData);

        
    });
    const formData = new FormData(form);
const xhr = new XMLHttpRequest();
xhr.open('POST', 'Responces.jsp', true);
// ...
xhr.send(formData);
    

    // ... (existing functions for creating/removing choice inputs)
});
        

        function createChoiceInputs(questionDiv, numChoices) {
            const choiceInputs = questionDiv.querySelector('.choice-inputs');
            if (!choiceInputs) {
                const choiceInputsDiv = document.createElement('div');
                choiceInputsDiv.className = 'choice-inputs';
                for (let i = 1; i <= numChoices; i++) {
                    const choiceInput = document.createElement('input');
                    choiceInput.type = 'text';
                    choiceInput.name = `choice-${i}`;
                    choiceInput.placeholder = `Choice ${i}`;
                    choiceInputsDiv.appendChild(choiceInput);
                }

                questionDiv.appendChild(choiceInputsDiv);
            }
        }

        function removeChoiceInputs(questionDiv) {
            const choiceInputs = questionDiv.querySelector('.choice-inputs');
            if (choiceInputs) {
                questionDiv.removeChild(choiceInputs);
            }
        }
        
        
        
        
        
    </script>
</body>
</html>
