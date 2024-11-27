import java.util.ArrayList;
import java.util.List;
class Lists
{
    public static void main(String[] args)
    {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println(arrayList);
        arrayList.add("Apple"); //  duplicate  value
        System.out.println(arrayList);
        arrayList.remove("Apple");
        System.out.println(arrayList);
       int size = arrayList.size();
       System.out.println(size);
    }
}