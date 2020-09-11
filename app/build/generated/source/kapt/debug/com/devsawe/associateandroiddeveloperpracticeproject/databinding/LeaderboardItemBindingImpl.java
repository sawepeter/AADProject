package com.devsawe.associateandroiddeveloperpracticeproject.databinding;
import com.devsawe.associateandroiddeveloperpracticeproject.R;
import com.devsawe.associateandroiddeveloperpracticeproject.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LeaderboardItemBindingImpl extends LeaderboardItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_learner_badge, 3);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LeaderboardItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LeaderboardItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            );
        this.learnerName.setTag(null);
        this.learnerScore.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.type == variableId) {
            setType((java.lang.Boolean) variable);
        }
        else if (BR.leaderBoardItem == variableId) {
            setLeaderBoardItem((com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setType(@Nullable java.lang.Boolean Type) {
        this.mType = Type;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.type);
        super.requestRebind();
    }
    public void setLeaderBoardItem(@Nullable com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem LeaderBoardItem) {
        this.mLeaderBoardItem = LeaderBoardItem;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.leaderBoardItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String typeLeaderBoardItemHoursToStringJavaLangStringLearningHoursLeaderBoardItemScoreToStringJavaLangStringSkillIQScoreLeaderBoardItemCountry = null;
        java.lang.Integer leaderBoardItemHours = null;
        java.lang.String leaderBoardItemHoursToStringJavaLangStringLearningHours = null;
        java.lang.String leaderBoardItemScoreToString = null;
        java.lang.String typeLeaderBoardItemHoursToStringJavaLangStringLearningHoursLeaderBoardItemScoreToStringJavaLangStringSkillIQScore = null;
        java.lang.Integer leaderBoardItemScore = null;
        java.lang.String leaderBoardItemName = null;
        java.lang.String leaderBoardItemScoreToStringJavaLangStringSkillIQScore = null;
        java.lang.Boolean type = mType;
        com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem leaderBoardItem = mLeaderBoardItem;
        java.lang.String leaderBoardItemCountry = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxType = false;
        java.lang.String leaderBoardItemHoursToString = null;

        if ((dirtyFlags & 0x7L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(type)
                androidxDatabindingViewDataBindingSafeUnboxType = androidx.databinding.ViewDataBinding.safeUnbox(type);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxType) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
                if (leaderBoardItem != null) {
                    // read leaderBoardItem.country
                    leaderBoardItemCountry = leaderBoardItem.getCountry();
                }
            if ((dirtyFlags & 0x6L) != 0) {

                    if (leaderBoardItem != null) {
                        // read leaderBoardItem.name
                        leaderBoardItemName = leaderBoardItem.getName();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (leaderBoardItem != null) {
                    // read leaderBoardItem.hours
                    leaderBoardItemHours = leaderBoardItem.getHours();
                }


                if (leaderBoardItemHours != null) {
                    // read leaderBoardItem.hours.toString()
                    leaderBoardItemHoursToString = leaderBoardItemHours.toString();
                }


                // read (leaderBoardItem.hours.toString()) + (" learning hours, ")
                leaderBoardItemHoursToStringJavaLangStringLearningHours = (leaderBoardItemHoursToString) + (" learning hours, ");
        }
        if ((dirtyFlags & 0x8L) != 0) {

                if (leaderBoardItem != null) {
                    // read leaderBoardItem.score
                    leaderBoardItemScore = leaderBoardItem.getScore();
                }


                if (leaderBoardItemScore != null) {
                    // read leaderBoardItem.score.toString()
                    leaderBoardItemScoreToString = leaderBoardItemScore.toString();
                }


                // read (leaderBoardItem.score.toString()) + (" skill IQ Score, ")
                leaderBoardItemScoreToStringJavaLangStringSkillIQScore = (leaderBoardItemScoreToString) + (" skill IQ Score, ");
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(type) ? (leaderBoardItem.hours.toString()) + (" learning hours, ") : (leaderBoardItem.score.toString()) + (" skill IQ Score, ")
                typeLeaderBoardItemHoursToStringJavaLangStringLearningHoursLeaderBoardItemScoreToStringJavaLangStringSkillIQScore = ((androidxDatabindingViewDataBindingSafeUnboxType) ? (leaderBoardItemHoursToStringJavaLangStringLearningHours) : (leaderBoardItemScoreToStringJavaLangStringSkillIQScore));


                // read (androidx.databinding.ViewDataBinding.safeUnbox(type) ? (leaderBoardItem.hours.toString()) + (" learning hours, ") : (leaderBoardItem.score.toString()) + (" skill IQ Score, ")) + (leaderBoardItem.country)
                typeLeaderBoardItemHoursToStringJavaLangStringLearningHoursLeaderBoardItemScoreToStringJavaLangStringSkillIQScoreLeaderBoardItemCountry = (typeLeaderBoardItemHoursToStringJavaLangStringLearningHoursLeaderBoardItemScoreToStringJavaLangStringSkillIQScore) + (leaderBoardItemCountry);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.learnerName, leaderBoardItemName);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.learnerScore, typeLeaderBoardItemHoursToStringJavaLangStringLearningHoursLeaderBoardItemScoreToStringJavaLangStringSkillIQScoreLeaderBoardItemCountry);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): type
        flag 1 (0x2L): leaderBoardItem
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(type) ? (leaderBoardItem.hours.toString()) + (" learning hours, ") : (leaderBoardItem.score.toString()) + (" skill IQ Score, ")
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(type) ? (leaderBoardItem.hours.toString()) + (" learning hours, ") : (leaderBoardItem.score.toString()) + (" skill IQ Score, ")
    flag mapping end*/
    //end
}