package remix.com.circleseekbar;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CircleSeekBar mView;
    private int mProgress = 0;
    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg)
        {
            mView.setProgress(mProgress);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        mView  = (CircleSeekBar)findViewById(R.id.circle_seekbar);
    }


}
