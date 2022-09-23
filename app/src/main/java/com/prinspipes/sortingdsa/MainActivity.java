package com.prinspipes.sortingdsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.prinspipes.sortingdsa.sortMethod.MergeSort;
import com.prinspipes.sortingdsa.sortMethod.QuickSort;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    EditText inputArrayEdt;
    TextView outputMessageTxt;
    TextView finalOutputTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        inputArrayEdt = findViewById(R.id.input_editText);
        outputMessageTxt = findViewById(R.id.output_textView);
        finalOutputTxt = findViewById(R.id.final_output_textView);
    }

    public void clickOnQuickSort(View view){

        String[] strArrayNumbers = inputArrayEdt.getText().toString().split(",");
        int arraySize = strArrayNumbers.length;
        if (arraySize > 0) {
            Integer[] intArrayNumbers = new Integer[arraySize];

            // convert string array into integer array
            for (int i = 0; i < arraySize; i++) {
                intArrayNumbers[i] = Integer.parseInt(strArrayNumbers[i]);
            }
            QuickSort quickSortObj = new QuickSort();
            Integer[] intSortedNumbers = quickSortObj.quickSort(intArrayNumbers, 0, arraySize - 1);
            outputMessageTxt.setText("Quick Sort Algo");
            finalOutputTxt.setText(Arrays.toString(intSortedNumbers));
        }
    }

    public void clickOnMergeSort(View view){

        String[] strArrayNumbers = inputArrayEdt.getText().toString().split(",");
        int arraySize = strArrayNumbers.length;
        if (arraySize > 0) {
            Integer[] intArrayNumbers = new Integer[arraySize];

            // convert string array into integer array
            for (int i = 0; i < arraySize; i++) {
                intArrayNumbers[i] = Integer.parseInt(strArrayNumbers[i]);
            }
            MergeSort mergeSortObj = new MergeSort();
            mergeSortObj.divide(intArrayNumbers, 0, arraySize - 1);
            outputMessageTxt.setText("Merge Sort Algo");
            finalOutputTxt.setText(Arrays.toString(intArrayNumbers));
        }
    }

}