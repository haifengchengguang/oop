/*
package design_pattern;

public class simpleCompany {
    public static void main(String[] args) {
        FruitGardener gardener = new FruitGardener();
        gardener.factory("grape");
        gardener.factory("apple");
        gardener.factory("strawberry");

    }
}
interface FruitIF {
    void grow();
    void harvest();
    void plant();
}
class Apple implements FruitIF
{
    public void grow()
    {
        log("Apple is growing..."); }
    public void harvest()
    {
        log("Apple has been harvested."); }
    public void plant()
    {
        log("Apple has been planted."); }
    public static void log(String msg)
    {
        System.out.println(msg); }
    public int getTreeAge() { return treeAge; }
    public void setTreeAge(int treeAge){
        this.treeAge = treeAge; }
    private int treeAge;
}
public class FruitGardener
{
    public FruitIF factory(String which) throws BadFruitException
    {
        if (which.equalsIgnoreCase("apple"))
        { return new Apple(); }
        else if (which.equalsIgnoreCase("strawberry"))
        { return new Strawberry(); }
        else if (which.equalsIgnoreCase("grape"))
        { return new Grape(); }
        else
        {
            throw new BadFruitException("Bad fruit request");
        } } }
*/
