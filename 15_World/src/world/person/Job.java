package world.person;

public class Job {

    String typeOfWork;
    int experience;

    public Job() { // defaul constructor
        // code
    }

    public Job(String type, int years) { // overloaded constructor
        this.typeOfWork = type;
        this.experience = years;
    }

    public void nameJob() {
        System.out.println("Your work is: " + typeOfWork);
    }

    public void experience() {
        System.out.println("Years of work: " + experience);
    }
}

class DemoJob {

    public static void main(String[] args) {
        Job job = new Job("Programmer of Java", 0);
        job.nameJob();
        job.experience();
    }
}
