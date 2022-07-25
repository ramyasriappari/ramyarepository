package motivity;    
import javax.persistence.*;  
import java.util.List;    
  
@Entity  
@Table(name="school")  
public class Teacher {    
  
@Id   
@GeneratedValue(strategy=GenerationType.TABLE)  
private int id;    
private String qname;    
  
@OneToMany(cascade = CascadeType.ALL)  
@JoinColumn(name="qid")  
@OrderColumn(name="type")  
private List<Student1> student;  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getQname() {  
    return qname;  
}  
public void setQname(String qname) {  
    this.qname = qname;  
}  
public List<Student1> getAnswers() {  
    return student;  
}  
public void setAnswers(List<Student1> answers) {  
    this.student = student;  
}      
}  