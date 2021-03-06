// Generated by data binding compiler. Do not edit!
package com.devsawe.associateandroiddeveloperpracticeproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.devsawe.associateandroiddeveloperpracticeproject.R;
import com.devsawe.associateandroiddeveloperpracticeproject.viewmodel.LeaderBoardViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLeaderBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView leaderboardRv;

  @Bindable
  protected LeaderBoardViewModel mViewmodel;

  protected FragmentLeaderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView leaderboardRv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.leaderboardRv = leaderboardRv;
  }

  public abstract void setViewmodel(@Nullable LeaderBoardViewModel viewmodel);

  @Nullable
  public LeaderBoardViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentLeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_leader, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLeaderBinding>inflateInternal(inflater, R.layout.fragment_leader, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_leader, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLeaderBinding>inflateInternal(inflater, R.layout.fragment_leader, null, false, component);
  }

  public static FragmentLeaderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentLeaderBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLeaderBinding)bind(component, view, R.layout.fragment_leader);
  }
}
