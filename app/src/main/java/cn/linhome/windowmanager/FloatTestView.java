package cn.linhome.windowmanager;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.linhome.lib.windowmanager.FFloatView;

public class FloatTestView extends FFloatView
{
    private Button btn_float;

    public FloatTestView(Context context)
    {
        super(context);
        init();
    }

    private void init()
    {
        setContentView(R.layout.view_float_test);
        btn_float = getContentView().findViewById(R.id.btn_float);

        btn_float.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getContext(), "测试测试", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
