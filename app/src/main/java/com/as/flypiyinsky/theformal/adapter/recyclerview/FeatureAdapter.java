package com.as.flypiyinsky.theformal.adapter.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.as.flypiyinsky.R;
import com.as.flypiyinsky.theformal.bean.caidao.CaidaoBean;
import com.bumptech.glide.Glide;

import java.util.List;

import shivam.developer.featuredrecyclerview.FeatureRecyclerViewAdapter;

public class FeatureAdapter extends FeatureRecyclerViewAdapter<RecyclerView.ViewHolder> {


    private static final int ITEM_TYPE_FEATURED = 0;
    private static final int ITEM_TYPE_DUMMY = 1;

    private List<CaidaoBean> caidaoBeans;

    public FeatureAdapter(List<CaidaoBean> caidaoBeans) {
        this.caidaoBeans = caidaoBeans;
    }

    @Override
    public RecyclerView.ViewHolder onCreateFeaturedViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case ITEM_TYPE_FEATURED:
                return new FeaturedViewHolder(
                        LayoutInflater.from(parent.getContext())
                                .inflate(R.layout.layout_featured_item, parent, false));
            case ITEM_TYPE_DUMMY:
            default:
                return new DummyViewHolder(
                        LayoutInflater.from(parent.getContext())
                                .inflate(R.layout.layout_dummy_item, parent, false));
        }
    }

    @Override
    public void onBindFeaturedViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof FeaturedViewHolder) {
            CaidaoBean caidaoBean = caidaoBeans.get(position);

            FeaturedViewHolder featuredViewHolder = (FeaturedViewHolder) holder;
            Glide.with(((FeaturedViewHolder) holder).imageView.getContext())
                    .load(caidaoBean.getImage())
                    .into(((FeaturedViewHolder) holder).imageView);

            featuredViewHolder.title.setText(caidaoBean.getTitle());
            featuredViewHolder.content.setText(caidaoBean.getContent());
            ((FeaturedViewHolder) holder).itemView.setOnClickListener(v -> {
                if(onItemClick!=null){
                    onItemClick.itemclick(position);
                }
            });


        } else if (holder instanceof DummyViewHolder) {
            ((DummyViewHolder) holder).itemView.setOnClickListener(v -> {
                if(onBottomClick!=null){
                    onBottomClick.bottomClick(position);
                }
            });
        }
    }

    @Override
    public int getFeaturedItemsCount() {
        return caidaoBeans.size() + 2; /* Return 2 extra dummy items */
    }

    @Override
    public int getItemViewType(int position) {
        return position >= 0 && position < caidaoBeans.size() ? ITEM_TYPE_FEATURED : ITEM_TYPE_DUMMY;
    }

    @Override
    public void onSmallItemResize(RecyclerView.ViewHolder holder, int position, float offset) {
        if (holder instanceof FeaturedViewHolder) {
            FeaturedViewHolder featuredViewHolder = (FeaturedViewHolder) holder;
            featuredViewHolder.content.setAlpha(offset / 100f);
        }
    }

    @Override
    public void onBigItemResize(RecyclerView.ViewHolder holder, int position, float offset) {
        if (holder instanceof FeaturedViewHolder) {
            FeaturedViewHolder featuredViewHolder = (FeaturedViewHolder) holder;
            featuredViewHolder.content.setAlpha(offset / 100f);
        }
    }


    static class FeaturedViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title,content;

        FeaturedViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.image_caidao_item);
            title = (TextView) itemView.findViewById(R.id.title_caidao_item);
            content = (TextView) itemView.findViewById(R.id.content_caidao_item);
        }
    }

    static class DummyViewHolder extends RecyclerView.ViewHolder {

        DummyViewHolder(View itemView) {
            super(itemView);
        }
    }

    public onItemClick onItemClick;
    public onBottomClick onBottomClick;

    public interface onItemClick{
        void itemclick(int position);
    }
    public interface onBottomClick{
        void bottomClick(int position);
    }

    public void setOnItemClick(FeatureAdapter.onItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public void setOnBottomClick(FeatureAdapter.onBottomClick onBottomClick) {
        this.onBottomClick = onBottomClick;
    }
}