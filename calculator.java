class calculator{

    float sum(int a,int b){
       return a+b;
    }

    float subs(int a,int b){
        return a-b;
    }

    float prod(int a,int b){
        return a*b;
    }

    float div(int a,int b){
        return a/b;
    }

    public static void main(String args[]){

        calculator c = new calculator();
        float Add = c.sum(10,20);
        float Sub = c.subs(10,20);
        float Prod = c.prod(10,20);
        float Div = c.div(10,20);

        System.out.println("Sum ="+Add);
        System.out.println("difference ="+Sub);
        System.out.println("Product ="+Prod);
        System.out.println("Division ="+Div);

    }


}
