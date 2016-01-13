package com.ironfactory.onestopexpress.controllers.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

import com.ironfactory.onestopexpress.controllers.adapter.ProductGridAdapter;
import com.ironfactory.onestopexpress.entities.ProductEntity;

import java.util.ArrayList;

/**
 * Created by IronFactory on 2016. 1. 12..
 */
public class ProductGridView extends GridView {

    private ArrayList<ProductEntity> productEntities;
    private OnAddProduct handler;

    public ProductGridView(Context context) {
        super(context);
        init(context);
    }

    public ProductGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ProductGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    //    public ProductGridView(Context context, MainActivity.OnAddProduct handler) {
//        super(context);
//        init(handler);
//    }
//
//    public ProductGridView(Context context, AttributeSet attrs, MainActivity.OnAddProduct handler) {
//        super(context, attrs);
//        init(handler);
//    }
//
//    public ProductGridView(Context context, AttributeSet attrs, int defStyleAttr, MainActivity.OnAddProduct handler) {
//        super(context, attrs, defStyleAttr);
//        init(handler);
//    }
//
//    public ProductGridView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//        this.handler = handler;
//    }


    private void init(Context context) {
        handler = (OnAddProduct) context;

        productEntities = new ArrayList<>();
        setNumColumns(AUTO_FIT);
        setColumnWidth(100);
        setVerticalSpacing(10);
        setHorizontalSpacing(10);
        setAdapter(new ProductGridAdapter(productEntities, handler));
    }



    public interface OnAddProduct {
        void onAdd(ProductEntity productEntity);
    }
}