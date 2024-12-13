package day12;

public class Singlebook {
	private String Title;
	private String Author;
	private double Price;
	private int Numberofcopies;

	public Singlebook()
	{
	}
		public Singlebook(String Title,String Author,double Price,int Numberofcopies){
			this.Title=Title;
			this.Author=Author;
			this.Price=Price;
			this.Numberofcopies=Numberofcopies;
		}
		public void setTitle(String Title) {
			this.Title=Title;
	}
		public void setAuthor(String Author) {
			this.Author=Author;
	}
		public void setPrice(double Price) {
			this.Price=Price;
	}
		public void setNumberofcopies(int Numberofcopies) {
			this.Numberofcopies=Numberofcopies;
	}
		public String getTitle() {
			return Title;
		}
		public double getPrice() {
			return Price;
		}
		public String getAuthor() {
			return Author;
		}
		public int getNumberofcopies() {
			return Numberofcopies;
		}
		public String toString() {
			return "your Title:"+Title+"\n your Author:"+Author+"\n your Price"+Price+"\n your Numberofcopies:"+Numberofcopies;
		}
		

}
