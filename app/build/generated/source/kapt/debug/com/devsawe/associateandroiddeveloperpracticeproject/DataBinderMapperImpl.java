package com.devsawe.associateandroiddeveloperpracticeproject;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.ActivityMainBindingImpl;
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.ConfirmDialogLayoutBindingImpl;
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.FragmentHomeBindingImpl;
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.FragmentLeaderBindingImpl;
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.FragmentSplashBindingImpl;
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.FragmentSubmitBindingImpl;
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.LeaderboardItemBindingImpl;
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.NotSuccessfulDailogLayoutBindingImpl;
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.SuccessfulDailogLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_CONFIRMDIALOGLAYOUT = 2;

  private static final int LAYOUT_FRAGMENTHOME = 3;

  private static final int LAYOUT_FRAGMENTLEADER = 4;

  private static final int LAYOUT_FRAGMENTSPLASH = 5;

  private static final int LAYOUT_FRAGMENTSUBMIT = 6;

  private static final int LAYOUT_LEADERBOARDITEM = 7;

  private static final int LAYOUT_NOTSUCCESSFULDAILOGLAYOUT = 8;

  private static final int LAYOUT_SUCCESSFULDAILOGLAYOUT = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devsawe.associateandroiddeveloperpracticeproject.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devsawe.associateandroiddeveloperpracticeproject.R.layout.confirm_dialog_layout, LAYOUT_CONFIRMDIALOGLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devsawe.associateandroiddeveloperpracticeproject.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devsawe.associateandroiddeveloperpracticeproject.R.layout.fragment_leader, LAYOUT_FRAGMENTLEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devsawe.associateandroiddeveloperpracticeproject.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devsawe.associateandroiddeveloperpracticeproject.R.layout.fragment_submit, LAYOUT_FRAGMENTSUBMIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devsawe.associateandroiddeveloperpracticeproject.R.layout.leaderboard_item, LAYOUT_LEADERBOARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devsawe.associateandroiddeveloperpracticeproject.R.layout.not_successful_dailog_layout, LAYOUT_NOTSUCCESSFULDAILOGLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devsawe.associateandroiddeveloperpracticeproject.R.layout.successful_dailog_layout, LAYOUT_SUCCESSFULDAILOGLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CONFIRMDIALOGLAYOUT: {
          if ("layout/confirm_dialog_layout_0".equals(tag)) {
            return new ConfirmDialogLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for confirm_dialog_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLEADER: {
          if ("layout/fragment_leader_0".equals(tag)) {
            return new FragmentLeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_leader is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSUBMIT: {
          if ("layout/fragment_submit_0".equals(tag)) {
            return new FragmentSubmitBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_submit is invalid. Received: " + tag);
        }
        case  LAYOUT_LEADERBOARDITEM: {
          if ("layout/leaderboard_item_0".equals(tag)) {
            return new LeaderboardItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for leaderboard_item is invalid. Received: " + tag);
        }
        case  LAYOUT_NOTSUCCESSFULDAILOGLAYOUT: {
          if ("layout/not_successful_dailog_layout_0".equals(tag)) {
            return new NotSuccessfulDailogLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for not_successful_dailog_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_SUCCESSFULDAILOGLAYOUT: {
          if ("layout/successful_dailog_layout_0".equals(tag)) {
            return new SuccessfulDailogLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for successful_dailog_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "leaderBoardItem");
      sKeys.put(2, "type");
      sKeys.put(3, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_main_0", com.devsawe.associateandroiddeveloperpracticeproject.R.layout.activity_main);
      sKeys.put("layout/confirm_dialog_layout_0", com.devsawe.associateandroiddeveloperpracticeproject.R.layout.confirm_dialog_layout);
      sKeys.put("layout/fragment_home_0", com.devsawe.associateandroiddeveloperpracticeproject.R.layout.fragment_home);
      sKeys.put("layout/fragment_leader_0", com.devsawe.associateandroiddeveloperpracticeproject.R.layout.fragment_leader);
      sKeys.put("layout/fragment_splash_0", com.devsawe.associateandroiddeveloperpracticeproject.R.layout.fragment_splash);
      sKeys.put("layout/fragment_submit_0", com.devsawe.associateandroiddeveloperpracticeproject.R.layout.fragment_submit);
      sKeys.put("layout/leaderboard_item_0", com.devsawe.associateandroiddeveloperpracticeproject.R.layout.leaderboard_item);
      sKeys.put("layout/not_successful_dailog_layout_0", com.devsawe.associateandroiddeveloperpracticeproject.R.layout.not_successful_dailog_layout);
      sKeys.put("layout/successful_dailog_layout_0", com.devsawe.associateandroiddeveloperpracticeproject.R.layout.successful_dailog_layout);
    }
  }
}
