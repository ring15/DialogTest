package com.founq.sdk.dialogtest;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_normal_dialog:
                AlertDialog alertDialog = new AlertDialog.Builder(this)
                        .setTitle("普通dialog")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("内容")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了忽略按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        }).create();
                alertDialog.show();
                break;
            case R.id.btn_list_dialog:
                String[] listItems = new String[]{"itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5",
                        "itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5",
                        "itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5",
                        "itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5"};
                AlertDialog alertDialog1 = new AlertDialog.Builder(this)
                        .setTitle("普通列表dialog")
                        .setIcon(R.mipmap.ic_launcher)
                        .setItems(listItems, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了item" + i, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了忽略按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        }).create();
                alertDialog1.show();
                break;
            case R.id.btn_radio_dialog:
                String[] radioItems = new String[]{"itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5",
                        "itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5",
                        "itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5",
                        "itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5"};
                AlertDialog alertDialog2 = new AlertDialog.Builder(this)
                        .setTitle("普通单选dialog")
                        .setIcon(R.mipmap.ic_launcher)
                        .setSingleChoiceItems(radioItems, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了item" + i, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了忽略按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        }).create();
                alertDialog2.show();
                break;
            case R.id.btn_multi_dialog:
                String[] mutiplyItems = new String[]{"itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5",
                        "itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5",
                        "itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5",
                        "itemlist0", "itemlist1", "itemlist2", "itemlist3", "itemlist4", "itemlist5"};
                boolean[] isChecks = new boolean[]{false, false, false, false, false,
                        false, false, false, false, false,
                        false, false, false, false, false,
                        false, false, false, false, false};
                AlertDialog alertDialog3 = new AlertDialog.Builder(this)
                        .setTitle("普通多选dialog")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMultiChoiceItems(mutiplyItems, isChecks, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                                if (b) {
                                    Toast.makeText(MainActivity.this, "选中了item" + i, Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(MainActivity.this, "未选中了item" + i, Toast.LENGTH_SHORT).show();
                                }
                            }
                        })
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了忽略按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        }).create();
                alertDialog3.show();
                break;
            case R.id.btn_dialog_with_edittext:
                EditText editText = new EditText(this);
                AlertDialog alertDialog4 = new AlertDialog.Builder(this)
                        .setTitle("普通多选dialog")
                        .setIcon(R.mipmap.ic_launcher)
                        .setView(editText)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点击了忽略按钮", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        }).create();
                alertDialog4.show();
                break;
            case R.id.btn_date_dialog:
                DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        Toast.makeText(MainActivity.this, "选择了" + i + "年-" + (i1 + 1) + "月-" + i2 + "日", Toast.LENGTH_SHORT).show();
                    }
                }, 2019, 8, 14);
                datePickerDialog.show();
                break;
            case R.id.btn_time_dialog:
                TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        Toast.makeText(MainActivity.this, "选择了" + i + "h-" + i1 + "m", Toast.LENGTH_SHORT).show();
                    }
                }, 1, 49, false);
                timePickerDialog.show();
                break;
            case R.id.btn_customize_dialog:
                MyDialog dialog = new MyDialog.MyBuilder(this)
                        .setTitle("标题")
                        .setListener(new MyDialog.myOnclickListener() {
                            @Override
                            public void onSure(MyDialog dialog) {
                                Toast.makeText(MainActivity.this, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }

                            @Override
                            public void onCancle(MyDialog dialog) {
                                Toast.makeText(MainActivity.this, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        }).build();
                dialog.show();
                break;
        }
    }
}
