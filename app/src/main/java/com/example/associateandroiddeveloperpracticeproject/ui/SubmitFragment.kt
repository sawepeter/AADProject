package com.example.associateandroiddeveloperpracticeproject.ui

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.associateandroiddeveloperpracticeproject.R
import com.example.associateandroiddeveloperpracticeproject.databinding.FragmentSubmitBinding
import com.example.associateandroiddeveloperpracticeproject.viewmodel.SubmitProjectViewModel


class SubmitFragment : Fragment() {

    lateinit var binding: FragmentSubmitBinding
    lateinit var actionbar:ActionBar
    lateinit var viewModel:SubmitProjectViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentSubmitBinding.inflate(inflater)
        (activity as AppCompatActivity?)!!.setSupportActionBar(binding.toolbar)
        (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayShowHomeEnabled(true)
        actionbar= (activity as AppCompatActivity?)!!.supportActionBar!!
        binding.lifecycleOwner=viewLifecycleOwner



        viewModel=ViewModelProvider(this).get(SubmitProjectViewModel::class.java)

        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.title=""

        binding.toolbar.setNavigationOnClickListener(View.OnClickListener {
            requireActivity().onBackPressed()
        })
        binding.submitBtn.setOnClickListener(View.OnClickListener {
            val dialogView = layoutInflater.inflate(R.layout.confirm_dialog_layout, null)

            val customDialog=createDialog(dialogView )

            dialogView.findViewById<ImageView>(R.id.cancel_button).setOnClickListener(View.OnClickListener {
                customDialog.cancel()
            })
            dialogView.findViewById<Button>(R.id.yes_button).setOnClickListener(View.OnClickListener {
                customDialog.cancel()
                submitForm()
//            setDialogImg(it,dialogView)
            })
        })



        viewModel.submitResponse.observe(viewLifecycleOwner, Observer {

            lateinit var dialogView:View
            if(it){
                dialogView = layoutInflater.inflate(R.layout.successful_dailog_layout, null)
            }
            else{
                dialogView = layoutInflater.inflate(R.layout.not_successful_dailog_layout, null)
            }
            setDialogImg(it,dialogView)

            val customDialog=createDialog(dialogView )


        })

        return binding.root
    }
    fun submitForm(){
        viewModel.postSunmit(binding.firstName.text.toString(),
            binding.lastName.text.toString(),
            binding.emailAddress.text.toString(),
            binding.githubLink.text.toString())
    }
    fun createDialog(dialogView: View):AlertDialog{
        val customDialog = context?.let { it1 ->
            AlertDialog.Builder(it1)
                .setView(dialogView)
                .show()
        }!!
        if (customDialog != null) {

            val id =Color.TRANSPARENT
            val color:ColorDrawable= ColorDrawable(id)
            customDialog.window!!.setBackgroundDrawable(color)
        }
        return customDialog
    }
    fun setDialogImg(status: Boolean, dialogView: View){

        if(status){
            dialogView.findViewById<ImageView>(R.id.dialog_img).setImageResource(R.drawable.successful)
        }
        else{
            dialogView.findViewById<ImageView>(R.id.dialog_img).setImageResource(R.drawable.not_successful)

        }
    }

}