package lab_2_2.webWork.Notebook.src.main.java.Notebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Notebook {
    List collection = new ArrayList();

    public boolean addition(String data){
        int beforeSize=collection.size();
        collection.add(data+" 现在的状态是:未完成");
        int afterSize=collection.size();
        if(afterSize==beforeSize+1)
            return true;
        else
            return false;
    }

    public boolean deleteSingle(int data){
        int beforeSize=collection.size();
        collection.remove(data);
        int afterSize=collection.size();
        if(afterSize==beforeSize-1)
            return true;
        else
            return false;
    }

    public boolean deleteAll(){
        collection.clear();
        if(collection.size()==0)
            return true;
        else
            return false;
    }

    public void showSingle(String num){
        System.out.println(collection.get(Integer.parseInt(num)));
    }

    public boolean showAll(){
        Iterator iterator = collection.iterator();
        int num=0;
        while(iterator.hasNext()){
            Object string = iterator.next();
            System.out.println(num+" "+string);//在这稍作修改，展示了序号
            num++;
        }
        System.out.println("数量为" + num);
        return true;
    }

    public boolean search(String name){
        int one_selection = collection.indexOf(name+" 现在的状态是:未完成");
        int two_selection = collection.indexOf(name+" 现在的状态是:已完成");
        if(one_selection==-1)
            System.out.println("第一次出现位置"+two_selection);
        else
            System.out.println("第一次出现位置"+one_selection);
        return true;
    }

    public boolean accomplish(int num){
        String wait_accomplish = collection.get(num)+"";
        collection.remove(num);
        collection.add(wait_accomplish.split(":")[0]+":已完成");
        if(search(collection.get(num)+":已完成"))
            return true;
        else
            return false;
    }
}
