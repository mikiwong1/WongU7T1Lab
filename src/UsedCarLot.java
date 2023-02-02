import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int param1, int param2){
        if(param1 < inventory.size() && param2 < inventory.size()){
            Car car1 = inventory.get(param1);
            Car car2 = inventory.get(param2);
            inventory.set(param1, car2);
            inventory.set(param2, car1);
            return true;
        } else {
            return false;
        }
    }
}
