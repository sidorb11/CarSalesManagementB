public class Car {

    private Category category;
    private Combustible combustible;
    private Transmission transmission;
    private EngineCapacity engineCapacity;
    private TankCapacity tankCapacity;
    private FuelConsumption fuelConsumption;
    private Emission emissions;
    private Color color;

    public Car (Category category, Combustible combustible, Transmission transmission, EngineCapacity engineCapacity,
                TankCapacity tankCapacity, FuelConsumption fuelConsumption, Emission emissions, Color color) {

        this.category = category;
        this.combustible = combustible;
        this.transmission = transmission;
        this.engineCapacity = engineCapacity;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
        this.emissions = emissions;
        this.color = color;

    }

}