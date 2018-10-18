package com.example.andriod.pic_share;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView)findViewById(R.id.image1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
                    intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
                    startActivity(Intent.createChooser(intent,"share using"));


            }
        });
    }
    public void image1(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }
    public void image2(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }
    public void image3(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }
    public void image4(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }
    public void image5(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }
    public void image6(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }

    public void image7(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }
    public void image8(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }

    public void image9(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }

    public void image10(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }

    public void image11(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }

    public void image12(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }
    public void image13(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }
    public void image14(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }

    public void image15(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }

    public void image16(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }

    public void image17(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT,"text");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"subject");
        startActivity(Intent.createChooser(intent,"share using"));

    }






}
