class BeachNamesTester{
public static void main (String []args){
BeachNames.addBeachName("Marina");
BeachNames.addBeachName("Malpe");
BeachNames.addBeachName("baga");
BeachNames.addBeachName("Trista");
BeachNames.addBeachName("Sky Light");
boolean value = BeachNames.addBeachName(null);
BeachNames.getBeachNames(value);
}
}

