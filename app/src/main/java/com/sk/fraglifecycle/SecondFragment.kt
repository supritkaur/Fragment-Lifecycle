package com.sk.fraglifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.sk.fraglifecycle.databinding.FragmentSecondBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var binding: FragmentSecondBinding
    lateinit var action :MainActivity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        action = activity as MainActivity
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =androidx.databinding.DataBindingUtil.inflate(layoutInflater, R.layout.fragment_second, container, false)
        arguments?.let { var testingValue = it.getString("Test")?:""
            binding.tvFrag1.setText(testingValue)
        }
        return binding.root
    }
    override fun onStart() {
        Toast.makeText(action,"on Start",Toast.LENGTH_LONG)
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(action,"on Resume",Toast.LENGTH_LONG)
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(action,"on Pause",Toast.LENGTH_LONG)
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(action,"on stop",Toast.LENGTH_LONG)
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(action,"on destroy view",Toast.LENGTH_LONG)
        super.onDestroyView()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(action,"on destroy",Toast.LENGTH_LONG)
        super.onDestroy()
    }



    override fun onDetach() {
        super.onDetach()
        Toast.makeText(action,"on detach",Toast.LENGTH_LONG)
        super.onDetach()
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SecondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}