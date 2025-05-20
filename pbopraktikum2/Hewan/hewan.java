public class Hewan{
protected String suara;
public  Hewan(){
this.suara="suara"l;
}
public void cetak(){
system.out.println("Hewan Bersuara"+suara);
}

class Mamalia extends Hewan{
protected string berkembangbiak;

public mamalia(){
this.berkembangbiak="beranak";
}

public void cetak(){
system.out.println("mamalia berkembang biak"+berkembangbiak);
}

}

class Sapi extends Mamalia{
private string nama;
private string umur;

public Kambing(){
suara = "embek..";
berkembangbiak="beranak";
this.nama="si ling";
this.umur="2";
}

public void cetak(){
system.out.println(x:======== Data Hewan Mamalia kambing ===========");
system.out.println("suara :"+suara);
system.out.println("berkembangbiak : "+ berkembangbiak);
system.out.println("nama : "+nama);
system.out.println("umur : "+umur+ "tahun");
}

}
class Unggas extends Hewan{
protected string berkembangbiak="Bertelur";

public Unggas(){
this.berkembangbiak="bertelur";
}

public void cetak (){
system.out.println(x:"bertelur");
}


}

class Burung extends Unggas{
private string jenis;
private string ciri;

public Burung(){
suara = "Mbekur..";
berkembangbiak="bertelur";
this.jenis="Merpati";
this.ciri="bulu putih";
}

public void cetak(){
system.out.println(x:======== Data Hewan Mamalia kambing ===========");
system.out.println("suara :"+suara);
system.out.println("berkembangbiak : "+ berkembangbiak);
system.out.println("jenis : "+jenis);
system.out.println("cir : "+umur ciri);
}




}
