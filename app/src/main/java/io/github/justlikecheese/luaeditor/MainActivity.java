package io.github.justlikecheese.luaeditor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.androlua.LuaEditor;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setFitsSystemWindows(true);
        LuaEditor editor = new LuaEditor(this);
        editor.setText("print('hello world')");
        layout.addView(editor);
        setContentView(layout);
    }
}