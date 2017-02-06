/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexcercises;

/**
 *
 * @author Eduardo
 */
public class FirstPartialExcercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* // TODO code application logic here
        Employee Rob=new Employee(1,"Rob","Rivera",30000);
        //Rob.raiseSalary(15);
        System.out.println(Rob.raiseSalary(15));
        //System.out.println(Rob.toString());
       
        //Prueba de MyTriangle
        MyTriangle tri = new MyTriangle(1,1,2,2,3,3);
        System.out.println(tri.toString());
        System.out.println(tri.getPerimeter());
        System.out.println(tri.getType());
        
        //Prueba de Time
        Time hora =new Time(10,50,58);
        System.out.println("Hora actual: "+hora.toString());
        System.out.println(hora.nextSecond());
        System.out.println(hora.previousSecond());
        
        //Prueba de Book
        
        Author juan= new Author("juan","mail",'m');
        Author pedro= new Author("pedro","mail",'m');
        Author[] autores = new Author[2];
        autores[0]=juan;
        autores[1]=pedro;
        
        Book libro1=new Book("nombre",autores,20,1);
        System.out.println(libro1.getAuthorNames(autores));
        System.out.println(libro1.toString());
        */
       
        System.out.println("Test MyRectangle");
        MyRectangle rectangulo =new MyRectangle(1,1,2,2); //Example values for each corner of the rectangle
        System.out.println(rectangulo.toString()); //Execute the showing of each parameter
                                                //including area and perimeter
    }
    
}
