package com.general.verified.thoughtworks;

import com.general.verified.thoughtworks.Graph;

public class QuestionMain {

	public static void main(String[] args) {
		Graph graph = new Graph();
		Question question = new Question(graph);
		question.questionOne();
		question.questionTwo();
		question.questionThree();
		question.questionFour();
		question.questionFive();
		question.questionSix();
		question.questionSeven();
		question.questionEight();
		question.questionNine();
		question.questionTen();
	}

}
