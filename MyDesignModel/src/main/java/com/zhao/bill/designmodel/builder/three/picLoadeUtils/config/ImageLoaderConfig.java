package com.zhao.bill.designmodel.builder.three.picLoadeUtils.config;

import com.zhao.bill.designmodel.builder.three.picLoadeUtils.cache.ImageCache;
import com.zhao.bill.designmodel.builder.three.picLoadeUtils.cache.MemoryCache;
import com.zhao.bill.designmodel.builder.three.picLoadeUtils.policy.LoadPolicy;
import com.zhao.bill.designmodel.builder.three.picLoadeUtils.policy.SerialPolicy;

/**
 * 配置
 * Created by Bill on 2017/12/20.
 */

public class ImageLoaderConfig {

    // 图片缓存配置对象
    ImageCache bitmapCache = new MemoryCache();

    // 加载图片时的loading和加载失败的图片配置对象
    DisplayConfig mDisplayConfig = new DisplayConfig();

    // 加载策略
    LoadPolicy mPolicy = new SerialPolicy();

    int threadCount = Runtime.getRuntime().availableProcessors() + 1;

    private ImageLoaderConfig() {

    }

    /**
     * 配置类的Builder
     */

    public static class Builder {
        ImageCache bitmapCache = new MemoryCache();
        DisplayConfig mDisplayConfig = new DisplayConfig();
        LoadPolicy mPolicy = new SerialPolicy();
        int threadCount = Runtime.getRuntime().availableProcessors() + 1;

        public Builder setThreadCount(int count) {
            this.threadCount = Math.max(1, count);
            return this;
        }

        public Builder setCache(ImageCache cache) {
            this.bitmapCache = cache;
            return this;
        }

        public Builder setLoadingPlaceHolder(int resId) {
            mDisplayConfig.loadingResId = resId;
            return this;
        }

        public Builder setNotFoundPlaceHolder(int resId) {
            mDisplayConfig.failedResId = resId;
            return this;
        }

        public Builder setLoadingPolicy(LoadPolicy policy) {
            if (policy != null) {
                mPolicy = policy;
            }
            return this;
        }

        void applyConfig(ImageLoaderConfig config) {
            config.bitmapCache = this.bitmapCache;
            config.mDisplayConfig = this.mDisplayConfig;
            config.mPolicy = this.mPolicy;
            config.threadCount = this.threadCount;
        }

        public ImageLoaderConfig create() {
            ImageLoaderConfig config = new ImageLoaderConfig();
            applyConfig(config);
            return config;
        }

    }
}
