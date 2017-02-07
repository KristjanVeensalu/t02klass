public class pyramiid{
  double d, k, h;
  public pyramiid(double diameeter,  double korgus, double kkorgus){
    if(diameeter<=0){throw new RuntimeException("Sobimatu diameeter");}
    if(korgus<=0){throw new RuntimeException("Sobimatu korgus");}
    if(kkorgus<=0){throw new RuntimeException("Sobimatu kulje korgus");}
    d=diameeter;
    k=korgus; //püramiidi kõrgus
    h=kkorgus;
  }
  public double PPindala(){ //Põhja pindala
    return Math.round(d*d);
  }
  public double PYmbermoot(){
    return Math.round(2*(d+d));
  }
  public double KPindala(){ //Külgpindala
    return Math.round(PYmbermoot()*h/2);
  }
  public double KoguPindala(){
    return Math.round(PPindala()+KPindala());
  }
  public double Ruumala(){
    return Math.round(PPindala()*k/3);
  }
  public String toString(){
		return "Pyramiid "+d+" x "+d+", Pohja umbermoot "+PYmbermoot()+",cm Pohja pindala "+PPindala()+" cm2 Kulgpindala "+KPindala()+" cm2 Kogupindala "+KoguPindala()+" cm2 Ruumala "+Ruumala()+" cm3";
	}
}
