package ru.geekbrains.main.site.at;

public class Robot implements Players{
    private String name;
    private int jump;
    private int run;
    private boolean success = true;

    public Robot(String name,int run,int jump) {

        this.name = name;
        this.jump = jump;
        this.run = run;
    }
    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void run() {
        System.out.println(name + " бежит максимум: " + run + "м");
    }

    public void jump() {
        System.out.println(name + " прыгает максимум: " + jump + "м");
    }
}

