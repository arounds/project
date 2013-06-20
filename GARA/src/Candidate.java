import java.util.Calendar;
import java.util.List;

public class Candidate extends Person{
	//Attributes
		//Events
		protected RecruitingEvent recruitingEvent;
		protected List<InterviewingEvent> listOfInterviewingEvents;
		protected Document doc;
	
	//Constructors		
		public Candidate(String inputFirst, String inputMiddle, String inputLast, 
				String inputMaiden, String inputPreferred, String inputEmail,
				String inputPhone, String inputStreetAddress, String inputCity,
				String inputState, String inputZipCode, String inputCountry, 
				String inputStatus, Calendar inputUpdateTime, 
				RecruitingEvent inputRecruitingEvent, List<InterviewingEvent> interviewingEvents, Document doc){
			super(inputFirst, inputMiddle, inputLast, inputMaiden, inputPreferred,
					inputEmail, inputPhone, inputStreetAddress, inputCity,
					inputState, inputZipCode, inputCountry, inputStatus, 
					inputUpdateTime);
			this.recruitingEvent = inputRecruitingEvent;
			this.listOfInterviewingEvents = interviewingEvents;
			this.doc = doc;
		}
	
	//Methods
		//Events
    public RecruitingEvent getRecruitingEvent(){
    	return recruitingEvent;
    }
		
	public void setRecruitingEvent(RecruitingEvent event){
		recruitingEvent = event;
	}
	
	public List<InterviewingEvent> getInterviewingEvents(){
		return listOfInterviewingEvents;
	}
	
	public void addInterviewingEvent(InterviewingEvent event){
		listOfInterviewingEvents.add(event);
	}
	
	public Document getDocument(){
		return doc;
	}
	
	public void setDocument(Document doc){
		this.doc = doc;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		String value;
		
		str.append(firstName);
		str.append(middleName);
		str.append(lastName);
		str.append(maidenName);
		str.append(preferredName);
		str.append(email);
		str.append(phone);
		str.append(streetAddress);
		str.append(city);
		str.append(state);
		str.append(zipCode);
		str.append(country);
		str.append(status);
		str.append(updateTime);
		
		value = str.toString();
		
		
		return value;
	}
}
