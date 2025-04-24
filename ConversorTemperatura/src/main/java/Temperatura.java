public class Temperatura {
    //atributo privado para armazenar temp-celsius
    private double tempCelsius;
    
    //construtor - criar o obj com uma temp inicial
    public Temperatura(double tempInicialCelsius){
        this.tempCelsius = tempInicialCelsius;
    }   
        //getter - para ler a temperatura
        public double getTemperaturaCelsius(){
            return tempCelsius;
        }
        
        //setter - p mudar a temp
        public void setTemperaturaCelsius(double mudarTempCelsius){
            this.tempCelsius = mudarTempCelsius;
        }
        
        //metodo para converter celsius para fahrenheit
        public double converteParaFahrenheit(){
            return (tempCelsius*9/5)+32;
        }
        //metodo para converter celsius para kelvin
        public double converterParaKelvin(){
            return tempCelsius+273.15;
        }
}
