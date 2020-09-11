package com.devsawe.associateandroiddeveloperpracticeproject.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0017H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/devsawe/associateandroiddeveloperpracticeproject/viewmodel/LeaderBoardViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "leaderBoardRepository", "Lcom/devsawe/associateandroiddeveloperpracticeproject/repository/LeaderBoardRepository;", "learningLeaders", "Landroidx/lifecycle/LiveData;", "", "Lcom/devsawe/associateandroiddeveloperpracticeproject/model/LeaderBoardModelItem;", "getLearningLeaders", "()Landroidx/lifecycle/LiveData;", "mLearningLeaders", "Landroidx/lifecycle/MutableLiveData;", "mSkillLeaders", "skillLeaders", "getSkillLeaders", "submitRepository", "Lcom/devsawe/associateandroiddeveloperpracticeproject/repository/SubmitRepository;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "fetchLeaderBoard", "", "leaderBoardType", "", "onCleared", "app_debug"})
public final class LeaderBoardViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope viewModelScope = null;
    private final com.devsawe.associateandroiddeveloperpracticeproject.repository.LeaderBoardRepository leaderBoardRepository = null;
    private final com.devsawe.associateandroiddeveloperpracticeproject.repository.SubmitRepository submitRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem>> mLearningLeaders = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem>> mSkillLeaders = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem>> getLearningLeaders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem>> getSkillLeaders() {
        return null;
    }
    
    public final void fetchLeaderBoard(@org.jetbrains.annotations.NotNull()
    java.lang.String leaderBoardType) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public LeaderBoardViewModel() {
        super();
    }
}