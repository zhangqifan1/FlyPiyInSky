package com.as.flypiyinsky.thelibrary.GlideUtils;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.module.GlideModule;

public class GlideConfiguration implements GlideModule {
    //FIXME: 该配置类需要在AndroidManifest.xml中声明
    // <meta-data
    //    android:name="lib.self.network.image.glide.GlideModule.GlideConfiguration"
    //    android:value="GlideModule" />
 
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        //自定义Glide默认的Bitmap格式(加载图片的质量)
//        builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888);
 
        //自定义缓存目录
        builder.setDiskCache(new InternalCacheDiskCacheFactory(context,
                GlideConfig.GLIDE_CARCH_DIR, //缓存路径
                GlideConfig.GLIDE_CATCH_SIZE)); //缓存大小
    }
 
 
    @Override
    public void registerComponents(Context context, Glide glide, Registry registry) {
 
    }
}