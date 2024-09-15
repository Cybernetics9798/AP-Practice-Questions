package TestQuestions;
public class TestDay {
//VW315XX4 Y.C.
//a)	
public double getTotalRevenue() {
		double sum=0;
		for(int i=0; i<allFlights.size(); i++) {
			int people=allFlights.get(i).getNumpassagers();
			double price=allFlights.get(i).getprice();
			int ca=allFlights.get(i).getCapacity();
			if(people>ca) {
				sum=sum+(ca*price);
			}
			else {
				sum=sum+(people*price);
			}
		}
		return sum;
	}
//b)
public int updateflights() {
	int count=0;
	for(int i=0; i<allFlights.size(); i++) {
		int p=allFlights.get(i).getNumpassages();
		int c=allFlights.get(i).getCapacity();
		double per=p/c;
		if(per<0.2) {
			allFlights.remove(i);
			count++;
		}
	}
	return count;
}
//c)
// A new private integer or double variable should be added to the Flight class, which is luggage capacity.
// The new method retrieves the luggage weight number from the Flight class.
}
