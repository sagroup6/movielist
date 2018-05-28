package com.example.luruoxuan.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        Fruit a = new Fruit("厭世媽咪日記", R.drawable.a,"Tully","《鴻孕當頭》製作團隊最新力作","96分鐘，劇情",R.drawable.level15);
        fruitList.add(a);
        Fruit b = new Fruit("真心話大冒險", R.drawable.b, "Truth or Dare", "《忌日快樂》製作公司邀你參加遊戲","100分鐘，懸疑/驚悚",R.drawable.level15);
        fruitList.add(b);
        Fruit c = new Fruit("原罪犯 ", R.drawable.c, "Old Boy","韓國名導朴贊郁復仇三部曲之二","120分鐘，劇情、犯罪、懸疑/驚悚",R.drawable.level18);
        fruitList.add(c);
        Fruit d = new Fruit("夢想新樂章", R.drawable.d, "I can only imagine","見證美好的生命奇蹟","111分鐘，劇情",R.drawable.level6);
        fruitList.add(d);
        Fruit e = new Fruit("尋愛偵探阿洛伊斯", R.drawable.e, "Aloys","疏離寓言因浪漫異想而不再抑鬱","91分鐘，奇幻、劇情、懸疑/驚悚",R.drawable.level6);
        fruitList.add(e);
        Fruit f = new Fruit("黑腥企業", R.drawable.f, "Corporate","停止職場霸凌，人人有責！","95分鐘，劇情",R.drawable.level6);
        fruitList.add(f);

    }
}