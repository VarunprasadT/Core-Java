class StadiumTester{
public static void main (String []args){
Stadium.addStadiumNames("Chinna Swamy Stadium");
Stadium.addStadiumNames("CHEPAKU");
Stadium.addStadiumNames("Narendra Modi");
Stadium.addStadiumNames("Eden Gardens");
Stadium.addStadiumNames("Wankhede Stadium");
Stadium.addStadiumNames("Salt lake Stadium");
Stadium.getStadiumNames();
Stadium.updateStadiumName("Varun","CHEPAKU");
Stadium.getStadiumNames();
Stadium.updateStadiumName("CHEPAKU",1);
Stadium.getStadiumNames();
Stadium.updateStadiumName("Modi",2);
Stadium.getStadiumNames();
Stadium.updateStadiumName("Narendra Modi",2);
Stadium.getStadiumNames();
Stadium.updateStadiumName("Gardens",3);
Stadium.getStadiumNames();
Stadium.updateStadiumName("Eden Gardens",3);
Stadium.getStadiumNames();
} 
}