package design_principle;

public class OCPtest {

        public static void main(String[] args){
            IBook novel = new NovelBook("笑傲江湖",100,"金庸");
            System.out.println("书籍名字："+novel.getName()+"书籍作者："+novel.getAuthor()+"书籍价格："+novel.getPrice());
        }

    }


interface IBook{
    public String getName();
    public double getPrice();
    public String getAuthor();
}
class NovelBook implements IBook{
    private String name;
    int price;
    private String author;

    public NovelBook(String name,int price,String author){
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
}

//扩展打折类

class OffNovelBook extends NovelBook{

    public OffNovelBook(String name,int price,String author){
        super(name,price,author);
    }

    //覆写价格方法，当价格大于40，就打8析，其他价格就打9析
    public double getPrice(){
        if(this.price > 40){
            return this.price * 0.8;
        }else{
            return this.price * 0.9;
        }
    }
}
