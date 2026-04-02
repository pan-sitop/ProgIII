
package javaapplication43;

public class JavaApplication43 {
    public static void main(String[] args) {
        //se una cola de prendas 
        Ccircular a=new Ccircular();
        Prenda xd = new Prenda("chalina","lana","azul",2130,1230,234);
        Prenda xd1 = new Prenda("poncho","polar","blanco",2210,230,2342);
        Prenda xd2 = new Prenda("guantes","cuero","cafe",344,120,32);
        Prenda xd3 = new Prenda("chompa","lana","verde",3465,120,123);
        Prenda xd4 = new Prenda("vestido","lana","rojo",787,1220,786);
        a.adicionar(xd);a.adicionar(xd1);a.adicionar(xd2);a.adicionar(xd3);a.adicionar(xd4);
        System.out.println("Pila prendas");
        Pilav b=new Pilav();
        b.adicionar(new Venta(2130,12,"12/12/2026"));
        b.adicionar(new Venta(2130,32,"12/3/2026"));
        b.adicionar(new Venta(2130,45,"12/5/2026"));
        b.adicionar(new Venta(787,96,"23/3/2026"));
        b.adicionar(new Venta(3465,5,"12/1/2026"));
        b.adicionar(new Venta(2210,1,"3/3/2026"));
        b.adicionar(new Venta(2210,2,"12/8/2026"));
        b.adicionar(new Venta(2130,7,"12/9/2026"));
        ej1(b, a);
        System.out.println("++++++++++++++");
        ej2(b, a);
        System.out.println("++++++++++++++");
        ej3(b, a);
        
        
    }
    public static void ej1(Pilav a, Ccircular b){
            int n=b.nroelem();
            Pilav q=new Pilav();
            for(int j=0;j<n;j++){
                Prenda aux= b.eliminar();
                int sum=0;
                while(!a.esvacia()){
                    Venta aux2=a.eliminar();
                    if(aux.getCodigo()==aux2.getCodigo()){
                        sum=sum+aux2.getCantidad();
                    }
                    q.adicionar(aux2);
                }
                a.vaciar(q);
                System.out.println(aux.getNombre() + " : " + sum);
                b.adicionar(aux);
            }
            
        }
    public static void ej2(Pilav a, Ccircular b){
            int n=b.nroelem();
            Pilav q=new Pilav();
            for(int j=0;j<n;j++){
                Prenda aux= b.eliminar();
                int sum=0;
                while(!a.esvacia()){
                    Venta aux2=a.eliminar();
                    if(aux.getCodigo()==aux2.getCodigo()){
                        sum=sum+aux2.getCantidad();
                    }
                    q.adicionar(aux2);
                }
                a.vaciar(q);
                
                if(sum==0){
                    System.out.println(aux.getNombre()+ " "+ sum);
                }
                b.adicionar(aux);
            }
            
        }
    public static void ej3(Pilav a, Ccircular b){
            int n=b.nroelem();
            Pilav q=new Pilav();
            int may=0;
            for(int j=0;j<n;j++){
                Prenda aux= b.eliminar();
                int sum=0;
                while(!a.esvacia()){
                    Venta aux2=a.eliminar();
                    if(aux.getCodigo()==aux2.getCodigo()){
                        sum=sum+aux2.getCantidad();
                    }
                    q.adicionar(aux2);
                }
                a.vaciar(q);
                if((sum*aux.getPrecio())>may){
                    may=sum*aux.getPrecio();
                    
                }
                b.adicionar(aux);
            }
            for(int j=0;j<n;j++){
                Prenda aux= b.eliminar();
                int sum=0;
                while(!a.esvacia()){
                    Venta aux2=a.eliminar();
                    if(aux.getCodigo()==aux2.getCodigo()){
                        sum=sum+aux2.getCantidad();
                    }
                    q.adicionar(aux2);
                }
                a.vaciar(q);
                if((sum*aux.getPrecio())==may){
                    System.out.println(aux.getNombre());
                    
                }
                b.adicionar(aux);
            }
            
            
        }
    
    
}
