package org.ozgur.databaase;

import org.ozgur.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Database {

    public List<Todo> getAllTodos(){
        List<Todo> todoList = new ArrayList<>();
        String[] titles = {
                "Grocery Shopping",
                "Finish Project Report",
                "Book Doctor Appointment",
                "Plan Weekend Getaway",
                "Organize Office Desk",
                "Update Resume",
                "Call Plumber",
                "Prepare Presentation",
                "Fix Leaky Faucet",
                "Research New Car Models",
                "Schedule Car Service",
                "Pay Electricity Bill",
                "Renew Gym Membership",
                "Buy Birthday Gift",
                "Write Blog Post",
                "Clean Garage",
                "Make Dinner Reservations",
                "Attend Parent-Teacher Meeting",
                "Study for Exam",
                "Update Blog",
                "Plan Family Reunion",
                "Donate Old Clothes",
                "Start Online Course",
                "Paint Living Room",
                "Book Flight Tickets",
                "Create Budget Plan",
                "Read Book",
                "Start Garden Project",
                "Backup Computer Files",
                "Organize Photos",
                "Learn New Language",
                "Plan Charity Event",
                "Write Thank You Notes",
                "Bake Cookies",
                "Watch Documentary",
                "Clean Windows",
                "Update Software",
                "Practice Yoga",
                "Meditate",
                "Write Journal",
                "Plan Healthy Meals",
                "Research Investment Options",
                "Schedule Dental Checkup",
                "Plan Picnic",
                "Visit Museum",
                "Attend Workshop",
                "Organize Closet",
                "Learn Guitar",
                "Volunteer at Shelter",
                "Plan Movie Night"
        };

        String[] descriptions = {
                "Buy fruits, vegetables, and milk",
                "Complete the final section of the report",
                "Book an appointment for a routine checkup",
                "Choose a destination and book accommodations",
                "Sort and organize paperwork",
                "Update work experience and skills",
                "Fix the leaking kitchen sink",
                "Prepare slides for the upcoming meeting",
                "Replace the washer in the bathroom faucet",
                "Compare features and prices of latest models",
                "Schedule a maintenance check for the car",
                "Pay the bill online before the due date",
                "Renew membership before it expires",
                "Find a thoughtful gift for a friend's birthday",
                "Write a post about recent travel experiences",
                "Remove clutter and organize tools",
                "Book a table at a favorite restaurant",
                "Discuss child's progress and areas of improvement",
                "Review chapters 4 and 5 for the upcoming test",
                "Add new content and update the layout",
                "Plan a gathering for extended family members",
                "Sort clothes and donate to a local charity",
                "Enroll in a course on web development",
                "Choose a color and start painting the walls",
                "Book flights for the upcoming vacation",
                "Create a plan to manage monthly expenses",
                "Finish reading 'The Alchemist' by Paulo Coelho",
                "Start a vegetable garden in the backyard",
                "Ensure all important files are backed up",
                "Sort and categorize digital photos",
                "Begin learning Spanish with online tutorials",
                "Organize a charity run to raise funds",
                "Write notes to thank friends for their support",
                "Try a new recipe for chocolate chip cookies",
                "Watch a documentary on climate change",
                "Clean the inside and outside of the windows",
                "Update all software to the latest versions",
                "Attend a yoga class to improve flexibility",
                "Spend 10 minutes meditating before bedtime",
                "Reflect on the day and write about experiences",
                "Plan meals for the week focusing on nutrition",
                "Learn about stocks, bonds, and mutual funds",
                "Book an appointment for a teeth cleaning",
                "Prepare food and games for an outdoor picnic",
                "Explore exhibits on modern art",
                "Learn new skills at a photography workshop",
                "Sort clothes and donate items no longer worn",
                "Take beginner lessons to learn chords",
                "Help out at the local animal shelter",
                "Choose movies and prepare snacks"
        };

        for (int i = 0; i < 50; i++) {
            Long id = (long) (i + 1);
            String title = titles[i];
            String description = descriptions[i];
            Status status = Status.values()[i % Status.values().length];
            Date createdAt = new Date();
            Date updatedAt = new Date();
            Todo todo = null;
            if(i % 3 == 0) {
                todo = new HighTodo(id, title, description, status, createdAt, updatedAt);
            }else if(i % 3 == 1){
                todo = new MediumTodo(id, title, description, status, createdAt, updatedAt);
            }else {
                todo = new LowTodo(id, title, description, status, createdAt, updatedAt);
            }
            todoList.add(todo);
        }

        return todoList;

    }

}
