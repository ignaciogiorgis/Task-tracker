package taskTracker.domain;

import java.util.Date;
import java.util.Objects;

public class Task {
    private int idTask;
    private String description;

    public enum Status {
        TODO, IN_PROGRESS, DONE
    }

    private Status status;
    private Date createdAt;
    private Date updatedAt;

    public Task() {
    }

    public Task(int idTask) {
        this.idTask = idTask;
    }

    public Task(String description, Date createdAt, Date updatedAt, Status status) {
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
    }

    public Task(int idTask, String description, Date updatedAt, Date createdAt, Status status) {
        this.idTask = idTask;
        this.description = description;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.status = status;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Task{" +
                "idTask=" + idTask +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return idTask == task.idTask && Objects.equals(description, task.description) && status == task.status && Objects.equals(createdAt, task.createdAt) && Objects.equals(updatedAt, task.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTask, description, status, createdAt, updatedAt);
    }
}
