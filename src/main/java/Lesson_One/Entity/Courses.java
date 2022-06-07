package Lesson_One.Entity;

import Lesson_One.Type;
import javax.persistence.*;
@Entity
@Table
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "duration")
    private int duration;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private Type type;
    @Column(name = "description")
    private String description;
    @Column(name = "teacher_id")
    private int teacher_id;
    @Column(name = "students_count")
    private int students_count;
    @Column(name = "price")
    private int price;
    @Column(name = "price_per_hour")
    private float price_per_hour;

    public Courses() {
    }


    public Courses(String name, int duration, Type type, String description, int price, float price_per_hour) {
        this.name = name;
        this.duration = duration;
        this.type = type;
        this.description = description;
        this.price = price;
        this.price_per_hour = price_per_hour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getStudents_count() {
        return students_count;
    }

    public void setStudents_count(int students_count) {
        this.students_count = students_count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getPrice_per_hour() {
        return price_per_hour;
    }

    public void setPrice_per_hour(float price_per_hour) {
        this.price_per_hour = price_per_hour;
    }

    @Override
    public String toString() {
        return "Entity.Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", teacher_id=" + teacher_id +
                ", students_count=" + students_count +
                ", price=" + price +
                ", price_per_hour=" + price_per_hour +
                '}';
    }
}

