package com.zhao.bill.designmodel;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhao.bill.designmodel.builder.three.picLoadeUtils.ImageListener;
import com.zhao.bill.designmodel.builder.three.picLoadeUtils.ImageLoaderUtil;
import com.zhao.bill.designmodel.builder.three.picLoadeUtils.cache.DiskCache;
import com.zhao.bill.designmodel.builder.three.picLoadeUtils.cache.DoubleCache;
import com.zhao.bill.designmodel.builder.three.picLoadeUtils.cache.MemoryCache;
import com.zhao.bill.designmodel.builder.three.util.PreferenceUtil;

/**
 * 图片加载
 * <p>
 * 单例模式
 * Builder模式
 */
public class ImageActivity extends AppCompatActivity implements ImageView.OnClickListener, ImageListener {

    private ImageLoaderUtil mUtil;
    private ImageView mImageView;
    private String url = "http://img.my.csdn.net/uploads/201407/26/1406383299_1976.jpg";

    public static final int DISK = 1;
    public static final int MEMORY = 2;
    public static final int BOTH = 3;
    public static final int NULL = 4;
    private TextView mTvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        mImageView = findViewById(R.id.iv_image);
        mTvShow = findViewById(R.id.tv_show);

        findViewById(R.id.disk).setOnClickListener(this);
        findViewById(R.id.memory).setOnClickListener(this);
        findViewById(R.id.two).setOnClickListener(this);
        findViewById(R.id.reset).setOnClickListener(this);

      /*  // builder模式
        ImageLoaderConfig config = new ImageLoaderConfig.Builder()
                .setLoadingPlaceHolder(R.drawable.ic_launcher_background)
                .setNotFoundPlaceHolder(R.drawable.ic_launcher_background)
                .setCache(new DoubleCache())
                .setLoadingPolicy(new SerialPolicy()).create();

        ImageLoaderUtil.getInstance().init(config);*/


        mUtil = ImageLoaderUtil.getInstance();

        int type = (int) PreferenceUtil.getObject(PreferenceUtil.getSharedPreference(ImageActivity.this), "type", 0);

        if (type == 1) {
            mTvShow.setText("展示方式为：磁盘缓存");
            Log.e("cache", "type为：磁盘缓存");

            // 获取实例
            mUtil.setImageCache(new DiskCache(PicApplication.getInstance(), url));
            mUtil.displayImage(url, mImageView);

        } else if (type == 2) {
            mTvShow.setText("展示方式为：内存缓存");
            Log.e("cache", "type为：内存缓存");

            // 获取实例
            mUtil.setImageCache(new MemoryCache());
            mUtil.displayImage(url, mImageView);

        } else if (type == 3) {
            mTvShow.setText("展示方式为：双重缓存");
            Log.e("cache", "type为：双重缓存");

            // 获取实例
            mUtil.setImageCache(new DoubleCache());
            mUtil.displayImage(url, mImageView);
        } else {
            mTvShow.setText("展示方式为：未设置");
        }

       /* // 自定义
        util.setImageCache(new ImageCache() {
            @Override
            public Bitmap get(String url) {
                return null;
            }

            @Override
            public void put(String url, Bitmap bitmap) {

            }
        });*/

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.disk:  // 磁盘缓存
                Log.e("cache", "点击了磁盘缓存：");
                PreferenceUtil.putObject(PreferenceUtil.getSharedPreference(ImageActivity.this), "type", DISK);
                mTvShow.setText("展示方式为：磁盘缓存");

                mUtil.setImageCache(new DiskCache(PicApplication.getInstance(), url));
                mUtil.displayImage(url, mImageView);
                break;

            case R.id.memory: // 内存缓存
                Log.e("cache", "点击了内存缓存：");
                PreferenceUtil.putObject(PreferenceUtil.getSharedPreference(ImageActivity.this), "type", MEMORY);
                mTvShow.setText("展示方式为：内存缓存");

                mUtil.setImageCache(new MemoryCache());
                mUtil.displayImage(url, mImageView);
                break;

            case R.id.two: // 双缓存
                Log.e("cache", "点击了双重缓存：");
                PreferenceUtil.putObject(PreferenceUtil.getSharedPreference(ImageActivity.this), "type", BOTH);
                mTvShow.setText("展示方式为：双重缓存");

                mUtil.setImageCache(new DoubleCache());
                mUtil.displayImage(url, mImageView);
                break;

            case R.id.reset: // 重置缓存
                Log.e("cache", "点击了重置缓存：");
                PreferenceUtil.putObject(PreferenceUtil.getSharedPreference(ImageActivity.this), "type", NULL);
                mTvShow.setText("展示方式为：暂未设置");

                mUtil.setImageCache(null);
                mUtil.removeCache(url);
                break;
        }
    }

    @Override
    public void onComplete(ImageView imageView, Bitmap bitmap, String url) {
        Log.e("cache", "客户端的回调：" + url);
    }
}
