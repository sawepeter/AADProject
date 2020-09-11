package com.devsawe.associateandroiddeveloperpracticeproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.LeaderboardItemBinding
import com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem
import com.devsawe.associateandroiddeveloperpracticeproject.utils.LEARNING_LEADERS

class LeaderBoardAdapter():androidx.recyclerview.widget.ListAdapter<LeaderBoardModelItem,LeaderBoardAdapter.ViewHolder>(LeaderBoardDiffUtil()) {


    var LeaderBoardItem:List<LeaderBoardModelItem>? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            LeaderboardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(
            binding
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val LeaderBoardItem=getItem(position)
        holder.bind( type,LeaderBoardItem)
    }
    var type: Boolean=false
    fun setLeaderBoardType(type : String){
        if(type== LEARNING_LEADERS){
            this.type=true
        }
        else{
            this.type=false
        }
    }
    class ViewHolder(private var binding : LeaderboardItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(
            type: Boolean,
            leaderBoardItem: LeaderBoardModelItem
        ){

            binding.leaderBoardItem=leaderBoardItem
            binding.type=type
            Glide.with(binding.topLearnerBadge.context)
                .load(leaderBoardItem.badgeUrl)
                .dontAnimate()
                .into(binding.topLearnerBadge)

            binding.executePendingBindings()
        }
    }
}

class LeaderBoardDiffUtil: DiffUtil.ItemCallback<LeaderBoardModelItem>(){
    override fun areItemsTheSame(oldItem: LeaderBoardModelItem, newItem: LeaderBoardModelItem): Boolean {
        return oldItem==newItem
    }

    override fun areContentsTheSame(oldItem: LeaderBoardModelItem, newItem: LeaderBoardModelItem): Boolean {
        return oldItem.name==newItem.name
    }

}