package com.xworkz.external3;

import com.xworkz.internal.rules3.OnlineLearning;

public class Coursera implements OnlineLearning {
    public void login() { System.out.println("Logged in to Coursera"); }
    public void watchLecture() { System.out.println("Watching lecture"); }
    public void takeQuiz() { System.out.println("Taking quiz"); }
    public void submitAssignment() { System.out.println("Submitting assignment"); }
    public void checkGrades() { System.out.println("Checking grades"); }
    public void downloadMaterials() { System.out.println("Downloading materials"); }
    public void joinDiscussion() { System.out.println("Joining discussion forum"); }
}