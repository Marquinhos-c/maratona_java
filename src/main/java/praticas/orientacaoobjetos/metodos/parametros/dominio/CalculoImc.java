package praticas.orientacaoobjetos.metodos.parametros.dominio;
/*
- Um segundo método que receba o valor do IMC e retorne uma string com a classificação correspondente:
- Abaixo de 18.5 → "Abaixo do peso"
- Entre 18.5 e 24.9 → "Peso normal"
- Entre 25.0 e 29.9 → "Sobrepeso"
- 30.0 ou mais → "Obesidade"

 */
public class CalculoImc {
    public double calculoImc(double peso, double altura) {
        if (peso < 0 || altura < 0) {
            System.out.println("Seu peso e altura deve ser maior que zero! ");
        }
        return peso / (altura * altura);
    }
    public String classificadorImc(double imc) {
        if (imc < 18.5) {
            return "abaixo do peso! ";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "peso normal! ";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "sobrepeso! ";
        } else {
            return "obesidade! ";
        }
    }
}
