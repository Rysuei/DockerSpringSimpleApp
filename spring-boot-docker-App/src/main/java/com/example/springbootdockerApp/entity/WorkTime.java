package com.example.springbootdockerApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class WorkTime {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private Date work_date;
    private Date start_date;
    private Date end_date;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public Date getWork_date() {return work_date;}
    public void setWork_date(Date work_date) {this.work_date = work_date;}

    public Date getStart_date() {return start_date;}
    public void setStart_date(Date start_date) {this.start_date = start_date;}

    public Date getEnd_date() {return end_date;}
    public void setEnd_date(Date end_date) {this.end_date = end_date;}
}