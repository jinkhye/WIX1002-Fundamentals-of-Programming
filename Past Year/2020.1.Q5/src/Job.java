
public class Job {

    public String jobname;
    public int task, memory;
    
    public Job(String jobname, int task, int memory) {
        this.jobname = jobname;
        this.task = task;
        this.memory = memory;
    }
    
    public String getJobname() {
        return jobname;
    }
    
    public int getTask() {
        return task;
    }
    
    public int getMemory() {
        return memory;
    }
    
    @Override
    public String toString() {
        return "Job Name : " + jobname + " Memory = " + memory + "GB Number Of Task = " + task;
    }
}