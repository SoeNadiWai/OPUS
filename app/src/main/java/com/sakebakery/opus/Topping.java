package com.sakebakery.opus;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Topping extends AppCompatActivity implements View.OnTouchListener, View.OnDragListener {

    String str = "";
    String clipData="";
    ImageView btns, btnbb,btng;
    ImageView imgDestination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topping);

        btns = findViewById(R.id.bberry);
        btnbb = findViewById(R.id.sberry);
        btng = findViewById(R.id.sprinkle);


        imgDestination = findViewById(R.id.toppingDestination);

        btns.setOnTouchListener(this);
        btnbb.setOnTouchListener(this);
        btng.setOnTouchListener(this);

        imgDestination.setOnDragListener(this);
        Intent intent = getIntent();
        str = intent.getStringExtra("message");
        Log.i("str",str);
        if(str.equals("strawberry"))
        {
            imgDestination.setImageResource(R.drawable.strawberrycream);
        }
        else if(str.equals("blueberry"))
        {
            imgDestination.setImageResource(R.drawable.strawberrybb);
        }
        else if(str.equals("grape"))
        {
            imgDestination.setImageResource(R.drawable.strawberrygrape);
        }
        else if(str.equals("butter"))
        {
            imgDestination.setImageResource(R.drawable.strawberrybutter);
        }
        else if(str.equals("chocolate"))
        {
            imgDestination.setImageResource(R.drawable.strawberrybut);
        }
        else if (str.equals("whip"))
        {
            imgDestination.setImageResource(R.drawable.whitecream);
        }


        Button mClickButton2 = (Button)findViewById(R.id.btnicing);


        mClickButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if (clipData.equals("s")) {
//                    Intent intent = new Intent(getApplicationContext(), Icing.class);
//                    intent.putExtra("message","strawberry");
//
//                    startActivity(intent);
//                } else if (clipData.equals("bb")) {
//                    Intent intent = new Intent(getApplicationContext(), Icing.class);
//                    intent.putExtra("message","chocolate");
//
//                    startActivity(intent);
//                } else if (clipData.equals("g")) {
//                    Intent intent = new Intent(getApplicationContext(), Icing.class);
//                    intent.putExtra("message","strawberry");
//
//                    startActivity(intent);
//                } else if (clipData.equals("butter")) {
//                    Intent intent = new Intent(getApplicationContext(), Icing.class);
//                    intent.putExtra("message","strawberry");
//
//                    startActivity(intent);
//                } else if (clipData.equals("c")) {
//                    Intent intent = new Intent(getApplicationContext(), Icing.class);
//                    intent.putExtra("message","strawberry");
//
//                    startActivity(intent);
//                } else if (clipData.equals("w")) {
//                    Intent intent = new Intent(getApplicationContext(), Icing.class);
//                    intent.putExtra("message","strawberry");
//
//                    startActivity(intent);
//                }

            }
        });


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        View.DragShadowBuilder mShadow = new View.DragShadowBuilder(v);
        ClipData.Item item = new ClipData.Item(v.getTag().toString());
        String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};
        ClipData data = new ClipData(v.getTag().toString(), mimeTypes, item);


        switch (v.getId()) {
            case R.id.sprinkle:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(data, mShadow, null, 0);
                } else {
                    v.startDrag(data, mShadow, null, 0);
                }

                break;
            case R.id.bberry:

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(data, mShadow, null, 0);
                } else {
                    v.startDrag(data, mShadow, null, 0);
                }
                break;
            case R.id.sberry:

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(data, mShadow, null, 0);
                } else {
                    v.startDrag(data, mShadow, null, 0);
                }
                break;

        }
        return false;
    }

    @Override
    public boolean onDrag(View v, DragEvent event) {
        switch (event.getAction()) {
            case DragEvent.ACTION_DRAG_STARTED:


                ((ImageView) v).setColorFilter(Color.WHITE);


                v.invalidate();
                return true;

            case DragEvent.ACTION_DRAG_ENTERED:
                clipData = event.getClipDescription().getLabel().toString();
                if (str.equals("strawberry")) {
                    if (clipData.equals("sprinkle")) {
                        imgDestination.setImageResource(R.drawable.sprinkleontop);
                    } else if (clipData.equals("bberry")) {
                        imgDestination.setImageResource(R.drawable.bontop);
                    } else if (clipData.equals("sberry")) {
                        imgDestination.setImageResource(R.drawable.sontop);
                    }
                    v.invalidate();
                    return true;
                }
                   else if (str.equals("blueberry")) {
                    if (clipData.equals("sprinkle")) {
                        imgDestination.setImageResource(R.drawable.spbontop);
                    } else if (clipData.equals("bberry")) {
                        imgDestination.setImageResource(R.drawable.bbontop);
                    } else if (clipData.equals("sberry")) {
                        imgDestination.setImageResource(R.drawable.sbontop);
                    }
                    v.invalidate();
                    return true;
                }

                else if (str.equals("grape")) {
                    if (clipData.equals("sprinkle")) {
                        imgDestination.setImageResource(R.drawable.grapesprinkle);
                    } else if (clipData.equals("bberry")) {
                        imgDestination.setImageResource(R.drawable.grapebberry);
                    } else if (clipData.equals("sberry")) {
                        imgDestination.setImageResource(R.drawable.grapesberry);
                    }
                    v.invalidate();
                    return true;
                }

                else if (str.equals("butter")) {
                    if (clipData.equals("sprinkle")) {
                        imgDestination.setImageResource(R.drawable.bcreamsprinkle);
                    } else if (clipData.equals("bberry")) {
                        imgDestination.setImageResource(R.drawable.bcreambberry);
                    } else if (clipData.equals("sberry")) {
                        imgDestination.setImageResource(R.drawable.bcreamsberry);
                    }
                    v.invalidate();
                    return true;
                }

                else if (str.equals("chocolate")) {
                    if (clipData.equals("sprinkle")) {
                        imgDestination.setImageResource(R.drawable.chocosprinkle);
                    } else if (clipData.equals("bberry")) {
                        imgDestination.setImageResource(R.drawable.chocobberry);
                    } else if (clipData.equals("sberry")) {
                        imgDestination.setImageResource(R.drawable.chocostrawberry);
                    }
                    v.invalidate();
                    return true;
                }

                else if (str.equals("whip")) {
                    if (clipData.equals("sprinkle")) {
                        imgDestination.setImageResource(R.drawable.whipsprinkle);
                    } else if (clipData.equals("bberry")) {
                        imgDestination.setImageResource(R.drawable.whipbberry);
                    } else if (clipData.equals("sberry")) {
                        imgDestination.setImageResource(R.drawable.whipsberry);
                    }
                    v.invalidate();
                    return true;
                }



                else {

                    if (clipData.equals("s")) {
                        imgDestination.setImageResource(R.drawable.plane);
                    } else if (clipData.equals("bb")) {
                        imgDestination.setImageResource(R.drawable.planec);
                    } else if (clipData.equals("g")) {
                        imgDestination.setImageResource(R.drawable.planec);
                    } else if (clipData.equals("butter")) {
                        imgDestination.setImageResource(R.drawable.planec);
                    } else if (clipData.equals("c")) {
                        imgDestination.setImageResource(R.drawable.planec);
                    } else if (clipData.equals("w")) {
                        imgDestination.setImageResource(R.drawable.planec);
                    }
                    v.invalidate();
                    return true;
                }

//                switch (clipData) {
//                    case "strawberry":
//                        imgDestination.setImageResource(R.drawable.plane);
////                        ((ImageView) v).setColorFilter(ContextCompat.getColor(DragandDrop.this, R.color.colorPrimary), android.graphics.PorterDuff.Mode.MULTIPLY);
//                        break;
//                    case "chocolate":
//                        imgDestination.setImageResource(R.drawable.planec);
////                        ((ImageView) v).setColorFilter(ContextCompat.getColor(DragandDrop.this, R.color.colorAccent), android.graphics.PorterDuff.Mode.MULTIPLY);
////                            break;
////                        case "strawberry":
////                            imgDestination.setImageResource(R.drawable.scake);
//                }
//
//                v.invalidate();
//                return true;

            case DragEvent.ACTION_DRAG_LOCATION:
                return true;

            case DragEvent.ACTION_DRAG_EXITED:

                ((ImageView) v).clearColorFilter();
                ((ImageView) v).setColorFilter(Color.YELLOW);

                v.invalidate();
                return true;

            case DragEvent.ACTION_DROP:


                clipData = event.getClipDescription().getLabel().toString();
                Toast.makeText(getApplicationContext(), clipData, Toast.LENGTH_SHORT).show();

                v.invalidate();
                return true;

            case DragEvent.ACTION_DRAG_ENDED:


                ((ImageView) v).clearColorFilter();
                if (event.getResult()) {
                    Toast.makeText(Topping.this, "Awesome!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Topping.this, "Aw Snap! Try dropping it again", Toast.LENGTH_SHORT).show();
                }
                return true;

            default:
                return false;
        }
    }
}

