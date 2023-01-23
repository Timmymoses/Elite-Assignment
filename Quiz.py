#Ask question and collect response from userprint
#check if the user response is equal to 'answer' print correct
#else print incorrect
#sum up the number of questions answered correctly
#ask the user if he/she will like to retake the quiz

import random

questions = [
    {
        "question": "Which country has the largest Economy in Africa? ", 
        "answer": "Nigeria"
    },
    {
        "question": "What month is Nigeria's independence? ", 
        "answer": "October"
    },
    {
        "question": "What is the name of the Nigeria currency? ", 
        "answer": "Naira"
    },
    {
	"question": "The name Nigeria was coined from Niger and area by? ",
	"answer": "Mary Slessor"
    },
    {
	"question": "The first storey building in Nigeria was built in? ",
	"answer": "Badagry"
    },
    {
	"question": "The Naira is the currency of Nigeria. One naira is divided into 100 what? ",
	"answer": "Kobo"
    },
    {
	"question": " What natural physical feature was Nigeria named after? ",
	"answer": "Niger River"
    },
    {
	"question": "The name of which city of Nigeria translates to by the edge of the meadow in Yoruba? ",
	"answer": "Ibadan"
    },
    {
	"question": "The Nigeria flag consist of many colors? ",
	"answer": "Two"
    },
    {
	"question": "Whose face is on the 20 Naira Note? ",
	"answer": "Murtala Muhammed"
    },
    {
	"question": "Which currency did the Nigeria adopted in the year 1973? ",
	"answer": "Naira"
    },
    {
	"question": "The national anthem of Nigeria has been Arise, O Compatriots since 1978. What was the previous national anthem? ",
	"answer": "Nigeria We Hail Thee"
    },
    {
	"question": "What is the capital of Nigeria? ",
	"answer": "Abuja"
    },
    {
	"question": "Which city is considered the hub of business in Nigeria? ",
	"answer": "Lagos"
    },
    {
	"question": "The Nigeria currency in 1972 was? ",
	"answer": "Nigerian Pound"
    },
    {
	"question": "Nigeria is a little over twice the size of what US state? ",
	"answer": "California"
    },
    {
	"question": "Nigerians like Wole Soyinka, Ben Okri and Chinua Achebe have all achieved renown in which field? ",
	"answer": "Literature"
    },
    {
	"question": "Which world-famous Nigerian novelist was the author of Things Fall Apart? ",
	"answer": "Chinua Achebe"
    },
    {
	"question": "Nigeria is divided into 36 states. Which one is the largest by land area? ",
	"answer": "Niger State"
    },
    {
	"question": "Who was the first senate president of the fourth republic? ",
	"answer": "Evan Enwerem"
    },
]

while true:

	point = 0

	for question in questions:
   		user_response = input(question["question"] + ": ")
    		if user_response.lower() == question["answer"].lower():
        	print("That's Correct!...Welldone")
        	point += 1
    		else:
        	print("Oops... That's Incorrect!. The correct answer is " + question["answer"] + ".")

	print("Your final score is " + str(point) + " out of " + str(len(questions)) + ".")
	print("Thank you for taking the quiz!")
	retry = input("Would you like to retake the quiz? (yes/no) ")
	if retry.lower() != "yes":
        	break