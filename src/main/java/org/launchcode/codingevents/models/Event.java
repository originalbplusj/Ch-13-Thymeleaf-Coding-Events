package org.launchcode.codingevents.models;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Objects;
import javax.persistence.Entity;

@Entity
public class Event {
    @Id
    @GeneratedValue
    private int id;


    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @Size(max = 500, message = "Description too long")
    private String description;

    @NotBlank (message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    private EventType type;

    //@NotBlank(message = "This field cannot be left blank")
    //private String location;

    //@AssertTrue(message = "You must register for the event")
    //private Boolean registrationStatus;

    //@Positive(message = "Number of attendees must be one or more")
    //private int numberOfAttendees;
    public Event(){ }
    public Event(String name, String description, String contactEmail, EventType type) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
        //this.location = location;
        //this.registrationStatus = registrationStatus;
        //this.numberOfAttendees = numberOfAttendees;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    //public String getLocation() {
        //return location;
    //}

    //public void setLocation(String location) {
        //this.location = location;
    //}

    //public Boolean getRegistrationStatus() {
        //return registrationStatus;
    //}

    //public void setRegistrationStatus(Boolean registrationStatus) {
        //this.registrationStatus = registrationStatus;
    //}

    //public int getNumberOfAttendees() {
        //return numberOfAttendees;
    //}

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
