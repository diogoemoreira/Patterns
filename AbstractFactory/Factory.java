public class Factory{
    //used to create the choosen type of factory
    public Factory(){
    }

    public FactInterface getFactory(String factName){
        //depending on the type choosen creates a different type of factory
        switch(factName.toLowerCase().trim()){
            case("modern"):return new ModernFactory();
            case("simple"):return new SimpleFactory();
            case("victorian"):return new VictorianFactory();
            default:System.out.println("Type doesnt exist choose from modern,simple or victorian");return null;
        }
    }
}