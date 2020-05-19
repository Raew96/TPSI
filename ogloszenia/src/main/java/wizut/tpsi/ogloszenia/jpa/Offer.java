package wizut.tpsi.ogloszenia.jpa;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "offer")
public class Offer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;

        @Column(name = "title")
        private String title;

        @Column(name = "year")
        private Integer year;

        @Column(name = "mileage")
        private Integer mileage;

        @Column(name = "engine_size")
        private BigDecimal engineSize;

        @Column(name = "engine_power")
        private Integer enginePower;

        @Column(name = "doors")
        private Integer doors;

        @Column(name = "colour")
        private String colour;

        @Lob
        @Column(name = "description")
        private String description;

        @Column(name = "price")
        private Integer price;

        @JoinColumn(name = "model_id", referencedColumnName = "id")
        @ManyToOne
        private CarModel model;

        @JoinColumn(name = "body_style_id", referencedColumnName = "id")
        @ManyToOne
        private BodyStyle bodyStyle;

        @JoinColumn(name = "fuel_type_id", referencedColumnName = "id")
        @ManyToOne
        private FuelType fuelType;

        public Integer getId() {
                return id;
        }

        public String getTitle() {
                return title;
        }

        public BigDecimal getEngineSize() {
                return engineSize;
        }

        public Integer getDoors() {
                return doors;
        }

        public BodyStyle getBodyStyle() {
                return bodyStyle;
        }

        public CarModel getModel() {
                return model;
        }

        public Integer getEnginePower() {
                return enginePower;
        }

        public FuelType getFuelType() {
                return fuelType;
        }

        public Integer getMileage() {
                return mileage;
        }

        public Integer getPrice() {
                return price;
        }

        public Integer getYear() {
                return year;
        }

        public String getColour() {
                return colour;
        }

        public String getDescription() {
                return description;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public void setBodyStyle(BodyStyle bodyStyle) {
                this.bodyStyle = bodyStyle;
        }

        public void setColour(String colour) {
                this.colour = colour;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public void setDoors(Integer doors) {
                this.doors = doors;
        }

        public void setEnginePower(Integer enginePower) {
                this.enginePower = enginePower;
        }

        public void setEngineSize(BigDecimal engineSize) {
                this.engineSize = engineSize;
        }

        public void setFuelType(FuelType fuelType) {
                this.fuelType = fuelType;
        }

        public void setMileage(Integer mileage) {
                this.mileage = mileage;
        }

        public void setModel(CarModel model) {
                this.model = model;
        }

        public void setPrice(Integer price) {
                this.price = price;
        }

        public void setYear(Integer year) {
                this.year = year;
        }
}
