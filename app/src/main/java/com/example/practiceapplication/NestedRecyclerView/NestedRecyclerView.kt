package com.example.practiceapplication.NestedRecyclerView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceapplication.Adapters.ParentRecyclerViewAdapter
import com.example.practiceapplication.Models.ParentModel
import com.example.practiceapplication.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NestedRecyclerView.newInstance] factory method to
 * create an instance of this fragment.
 */
class NestedRecyclerView : Fragment() {

    private lateinit var parentRecyclerView: RecyclerView
    private lateinit var parentAdapter: RecyclerView.Adapter<*>
    private val parentModelArrayList = ArrayList<ParentModel>()
    private lateinit var parentLayoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_nested_recycler_view, container, false)

        // Set the Categories for each array list set in the `ParentViewHolder`
        parentModelArrayList.add(ParentModel("Category1"))
        parentModelArrayList.add(ParentModel("Category2"))
        parentModelArrayList.add(ParentModel("Category3"))
        parentModelArrayList.add(ParentModel("Category4"))
        parentModelArrayList.add(ParentModel("Category5"))
        parentModelArrayList.add(ParentModel("Category6"))

        parentRecyclerView = view.findViewById(R.id.Parent_recyclerView)
        parentRecyclerView.setHasFixedSize(true)
        parentLayoutManager = LinearLayoutManager(activity)
        parentAdapter = ParentRecyclerViewAdapter(parentModelArrayList, requireActivity())
        parentRecyclerView.layoutManager = parentLayoutManager
        parentRecyclerView.adapter = parentAdapter
        parentAdapter.notifyDataSetChanged()

        return view
    }
}
