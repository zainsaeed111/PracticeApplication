package com.example.practiceapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceapplication.Models.ChildModel
import com.example.practiceapplication.Models.ParentModel
import com.example.practiceapplication.R

class ParentRecyclerViewAdapter(private val parentModelArrayList: ArrayList<ParentModel>, private val context: Context) :
    RecyclerView.Adapter<ParentRecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val category: TextView = itemView.findViewById(R.id.food_category)
        val childRecyclerView: RecyclerView = itemView.findViewById(R.id.Child_RV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_reyclerview_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return parentModelArrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = parentModelArrayList[position]
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        holder.childRecyclerView.layoutManager = layoutManager
        holder.childRecyclerView.setHasFixedSize(true)

        holder.category.text = currentItem.getFoodCategory()

        val arrayList = ArrayList<ChildModel>()

        // Add child items based on the parent category
        when (currentItem.getFoodCategory()) {
            "Category1" -> {
                arrayList.add(ChildModel(R.drawable.food_imge,"my blue barry"))
                arrayList.add(ChildModel(R.drawable.food_imge," pizza"))
                arrayList.add(ChildModel(R.drawable.food_imge," burger"))
                arrayList.add(ChildModel(R.drawable.food_imge," lazania"))
                arrayList.add(ChildModel(R.drawable.food_imge,"biryani"))
                arrayList.add(ChildModel(R.drawable.food_imge,"Wingd"))
            }
            "Category2" -> {
                arrayList.add(ChildModel(R.drawable.food_imge,"my blue barry"))
                arrayList.add(ChildModel(R.drawable.food_imge," pizza"))
                arrayList.add(ChildModel(R.drawable.food_imge," burger"))
                arrayList.add(ChildModel(R.drawable.food_imge," lazania"))
                arrayList.add(ChildModel(R.drawable.food_imge,"biryani"))
                arrayList.add(ChildModel(R.drawable.food_imge,"Wingd"))
            }
            "Category3" -> {
                arrayList.add(ChildModel(R.drawable.food_imge,"my blue barry"))
                arrayList.add(ChildModel(R.drawable.food_imge," pizza"))
                arrayList.add(ChildModel(R.drawable.food_imge," burger"))
                arrayList.add(ChildModel(R.drawable.food_imge," lazania"))
                arrayList.add(ChildModel(R.drawable.food_imge,"biryani"))
                arrayList.add(ChildModel(R.drawable.food_imge,"Wingd"))
            }
            "Category4" -> {
                arrayList.add(ChildModel(R.drawable.food_imge,"my blue barry"))
                arrayList.add(ChildModel(R.drawable.food_imge," pizza"))
                arrayList.add(ChildModel(R.drawable.food_imge," burger"))
                arrayList.add(ChildModel(R.drawable.food_imge," lazania"))
                arrayList.add(ChildModel(R.drawable.food_imge,"biryani"))
                arrayList.add(ChildModel(R.drawable.food_imge,"Wingd"))
            }
            "Category5" -> {
                arrayList.add(ChildModel(R.drawable.food_imge,"my blue barry"))
                arrayList.add(ChildModel(R.drawable.food_imge," pizza"))
                arrayList.add(ChildModel(R.drawable.food_imge," burger"))
                arrayList.add(ChildModel(R.drawable.food_imge," lazania"))
                arrayList.add(ChildModel(R.drawable.food_imge,"biryani"))
                arrayList.add(ChildModel(R.drawable.food_imge,"Wingd"))}

        }}
    }
