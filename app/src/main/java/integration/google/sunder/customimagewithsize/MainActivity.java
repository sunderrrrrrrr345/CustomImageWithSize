package integration.google.sunder.customimagewithsize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button btnzIn;
    private Button btnzOut;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnzIn = (Button)findViewById(R.id.btnZoomIn);
        btnzOut = (Button)findViewById(R.id.btnZoomOut);
        img = (ImageView)findViewById(R.id.imgvw);
      /*  btnzIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  img.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in));
                img.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down));
               // img.clearAnimation();
            }
        });*/
        btnzOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            //    img.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up));
                img.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out));

            }
        });
    }
}
