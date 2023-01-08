/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan241022;


public class StudentController {
    private Student model; 
	private StudentView view; 
	public StudentController(Student model, StudentView view){ 
		this.model = model; 
		this.view = view; 
	} 
	public void setStudentName(String name){ 
		model.setName(name); 
	} 
	public String getStudentName(){ 
		return model.getName(); 
	} 
	public void setStudentNim(String nim){ 
		model.setNim(nim); 
	} 
	public String getStudentNim(){ 
		return model.getNim(); 
	} 
	public void updateView(){ 
		view.printStudentDetails(model.getName(), model.getNim()); 
	} 
}
