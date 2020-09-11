package com.devsawe.associateandroiddeveloperpracticeproject.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u001bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/devsawe/associateandroiddeveloperpracticeproject/adapter/LeaderBoardAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/devsawe/associateandroiddeveloperpracticeproject/model/LeaderBoardModelItem;", "Lcom/devsawe/associateandroiddeveloperpracticeproject/adapter/LeaderBoardAdapter$ViewHolder;", "()V", "LeaderBoardItem", "", "getLeaderBoardItem", "()Ljava/util/List;", "setLeaderBoardItem", "(Ljava/util/List;)V", "type", "", "getType", "()Z", "setType", "(Z)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setLeaderBoardType", "", "ViewHolder", "app_debug"})
public final class LeaderBoardAdapter extends androidx.recyclerview.widget.ListAdapter<com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem, com.devsawe.associateandroiddeveloperpracticeproject.adapter.LeaderBoardAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem> LeaderBoardItem;
    private boolean type = false;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem> getLeaderBoardItem() {
        return null;
    }
    
    public final void setLeaderBoardItem(@org.jetbrains.annotations.Nullable()
    java.util.List<com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.devsawe.associateandroiddeveloperpracticeproject.adapter.LeaderBoardAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.devsawe.associateandroiddeveloperpracticeproject.adapter.LeaderBoardAdapter.ViewHolder holder, int position) {
    }
    
    public final boolean getType() {
        return false;
    }
    
    public final void setType(boolean p0) {
    }
    
    public final void setLeaderBoardType(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public LeaderBoardAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/devsawe/associateandroiddeveloperpracticeproject/adapter/LeaderBoardAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/devsawe/associateandroiddeveloperpracticeproject/databinding/LeaderboardItemBinding;", "(Lcom/devsawe/associateandroiddeveloperpracticeproject/databinding/LeaderboardItemBinding;)V", "bind", "", "type", "", "leaderBoardItem", "Lcom/devsawe/associateandroiddeveloperpracticeproject/model/LeaderBoardModelItem;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.devsawe.associateandroiddeveloperpracticeproject.databinding.LeaderboardItemBinding binding;
        
        public final void bind(boolean type, @org.jetbrains.annotations.NotNull()
        com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem leaderBoardItem) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.devsawe.associateandroiddeveloperpracticeproject.databinding.LeaderboardItemBinding binding) {
            super(null);
        }
    }
}