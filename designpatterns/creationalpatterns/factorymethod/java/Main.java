package designpatterns.creationalpatterns.factorymethod.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    GetPlanFactory planFactory = new GetPlanFactory();
    System.out.print("Ingrese el nombre del plan para el cual se generará la factura: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String planName = br.readLine();
    System.out.print("Ingrese el número de unidades para la factura que se calculará: ");
    int units=Integer.parseInt(br.readLine());

    APlan p = planFactory.getPlan(planName);

    System.out.print("Monto de la factura por " + planName + " de  " + units + " unidades es: ");
    p.getRate();
    p.calculateBill(units);
  }
}
