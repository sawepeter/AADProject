package com.devsawe.associateandroiddeveloperpracticeproject.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/devsawe/associateandroiddeveloperpracticeproject/network/LeaderBoardServices;", "", "fetchLeaderBoardAsync", "Lkotlinx/coroutines/Deferred;", "", "Lcom/devsawe/associateandroiddeveloperpracticeproject/model/LeaderBoardModelItem;", "type", "", "app_debug"})
public abstract interface LeaderBoardServices {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{type}")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem>> fetchLeaderBoardAsync(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "type")
    java.lang.String type);
}