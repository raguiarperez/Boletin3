
package boletin3;

public class consume {
    //atributos
        private float pGas;
        private float litros;
        private float km;
        private float vMed;
        
        //constructores
        public consume(){
            
        }
        
        public consume(float gasolina,float litros,float km,float vMed){
            pGas=gasolina; this.litros=litros; this.km=km; this.vMed=vMed;
        }
        
        public float getTempo(){
            return litros/km;
        }
        
        public float consumoMedio(){
            return litros*100/km;
        }
        
        public float consumoEuros(){
            return pGas*(litros*100/km);
        }
        
        public void setkms(float km){
            this.km=km;
        }
        public void setpGas(float pGas){
            this.pGas=pGas;
        }
        public void setlitros(float litros){
            this.litros=litros;
        }
        public void setvMed(float vMed){
            this.vMed=vMed;
        }
        
        public void vMed(){
            System.out.println("velcidad media es : "+vMed);
        }
    }
        

