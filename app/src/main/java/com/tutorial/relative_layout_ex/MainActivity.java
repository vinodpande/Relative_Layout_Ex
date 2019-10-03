package com.tutorial.relative_layout_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*
 RelativeLayout is a ViewGroup which is used to specify the position of child View instances relative to each other (Child A to the left of Child B) or
 relative to the parent (Aligned to the top of parent).

 RelativeLayout is very useful to design user interface because by using relative layout we can eliminate the nested view groups and keep our layout hierarchy flat,
 which improves performance of application.

 Android Positioning Views in Relative Layout
 RelativeLayout we need to specify the position of child views relative to each other or relative to the parent.
 In case if we didn’t specify the position of child views, by default all child views are positioned to top-left of the layout.

 Following are the some of most useful layout properties available to views in RelativeLayout.
    layout_alignParentTop	-> If it specified “true”, the top edge of view will match the top edge of parent.
    layout_alignParentBottom ->	If it specified “true”, the bottom edge of view will match the bottom edge of parent.
    layout_alignParentLeft -> If it specified “true”, the left edge of view will match the left edge of parent.
    layout_alignParentRight -> If it specified “true”, the right edge of view will match the right edge of parent.
    layout_centerInParent -> If it specified “true”, the view will be aligned to centre of parent.
    layout_centerHorizontal -> If it specified “true”, the view will be horizontally centre aligned within its parent.
    layout_centerVertical -> If it specified “true”, the view will be vertically centre aligned within its parent.
    layout_above -> It accepts another sibling view id and places the view above the specified view id.
    layout_below -> It accepts another sibling view id and places the view below the specified view id.
    layout_toLeftOf ->	It accepts another sibling view id and places the view left of the specified view id.
    layout_toRightOf ->It accepts another sibling view id and places the view right of the specified view id.
    layout_toStartOf ->	It accepts another sibling view id and places the view to start of the specified view id.
    layout_toEndOf -> It accepts another sibling view id and places the view to end of the specified view id.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
