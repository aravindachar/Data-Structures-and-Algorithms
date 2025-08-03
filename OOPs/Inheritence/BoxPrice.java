 class BoxPrice extends BoxWeight{
    double price ;


    BoxPrice(double l , double w , double h , double weight , double price){
        super(l, w,h,weight);
        this.price = price ;
    }
    BoxPrice(double price ){
        this.price = price ;
    }
}
