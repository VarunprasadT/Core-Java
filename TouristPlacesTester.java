class TouristPlacesTester{
public static void main (String []args){
TouristPlaces.addTouristPlacesNames("Goa");
TouristPlaces.addTouristPlacesNames("Ankola");
TouristPlaces.addTouristPlacesNames("Dubai");
TouristPlaces.addTouristPlacesNames("Balli");
TouristPlaces.addTouristPlacesNames("ThaiLand");
TouristPlaces.addTouristPlacesNames("Indonasiya");
TouristPlaces.getTouristPlacesNames();
TouristPlaces.updateTouristPlaceName("Udupi","Dubai");
TouristPlaces.getTouristPlacesNames();
TouristPlaces.updateTouristPlaceName("Mumbai",4);
TouristPlaces.getTouristPlacesNames();
}
}