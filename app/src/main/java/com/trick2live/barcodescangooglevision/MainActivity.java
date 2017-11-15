package com.trick2live.barcodescangooglevision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;


import com.google.android.gms.vision.barcode.Barcode;
import com.trick2live.barcodescan.BarcodeReader;

import java.util.List;

public class MainActivity extends AppCompatActivity implements BarcodeReader.BarcodeReaderListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onScanned(Barcode barcode) {

    }

    @Override
    public void onScannedMultiple(List<Barcode> barcodes) {

    }

    @Override
    public void onBitmapScanned(SparseArray<Barcode> sparseArray) {

    }

    @Override
    public void onScanError(String errorMessage) {

    }

    @Override
    public void onCameraPermissionDenied() {

    }
}
