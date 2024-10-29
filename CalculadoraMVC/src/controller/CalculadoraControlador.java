package controller;

import javafx.scene.control.TextField;
import model.CalculadoraModelo;
import view.CalculadoraVista;

public class CalculadoraControlador {

    private CalculadoraModelo modelo;
    private CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Asignar accion a los botones
        vista.getAddButton().setOnAction(e -> manejarSuma());
        vista.getSubtractButton().setOnAction(e -> manejarResta());
        vista.getMultiplyButton().setOnAction(e -> manejarMultiplicacion());
        vista.getDivideButton().setOnAction(e -> manejarDivision());
    }

    private void manejarSuma() {
        double num1 = obtenerNumero(vista.getNum1Field());
        double num2 = obtenerNumero(vista.getNum2Field());
        double resultado = modelo.sumar(num1, num2);
        vista.getResultLabel().setText("Resultado: " + resultado);
    }

    private void manejarResta() {
        double num1 = obtenerNumero(vista.getNum1Field());
        double num2 = obtenerNumero(vista.getNum2Field());
        double resultado = modelo.restar(num1, num2);
        vista.getResultLabel().setText("Resultado: " + resultado);
    }

    private void manejarMultiplicacion() {
        double num1 = obtenerNumero(vista.getNum1Field());
        double num2 = obtenerNumero(vista.getNum2Field());
        double resultado = modelo.multiplicar(num1, num2);
        vista.getResultLabel().setText("Resultado: " + resultado);
    }

    private void manejarDivision() {
        double num1 = obtenerNumero(vista.getNum1Field());
        double num2 = obtenerNumero(vista.getNum2Field());
        try {
            double resultado = modelo.dividir(num1, num2);
            vista.getResultLabel().setText("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            vista.getResultLabel().setText("Error: " + e.getMessage());
        }
    }

    private double obtenerNumero(TextField textField) {
        try {
            return Double.parseDouble(textField.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
