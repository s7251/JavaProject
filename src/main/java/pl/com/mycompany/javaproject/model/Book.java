package pl.com.mycompany.javaproject.model;

 
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

 
@Entity
public class Book implements Serializable {
 
  private Long id;
  private String subject;
  private String header;
 
  @Id
  @GeneratedValue
  public Long getId() {
    return id;
  }
 
  public void setId(Long id) {
    this.id = id;
  }
 
  public String getSubject() {
    return subject;
  }
 
  public void setSubject(String subject) {
    this.subject = subject;
  }
 
  public String getHeader() {
    return header;
  }
 
  public void setHeader(String header) {
    this.header = header;
  }
}

