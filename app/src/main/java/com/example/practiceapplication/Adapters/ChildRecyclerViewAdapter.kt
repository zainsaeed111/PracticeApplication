import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceapplication.Models.ChildModel
import com.example.practiceapplication.R

class ChildRecyclerViewAdapter(private val childModelArrayList: ArrayList<ChildModel>, private val cxt: Context) : RecyclerView.Adapter<ChildRecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var foodImage: ImageView = itemView.findViewById(R.id.food_img)
        var foodName: TextView = itemView.findViewById(R.id.food_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_recyclerview_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = childModelArrayList[position]
        holder.foodImage.setImageResource(currentItem.getFoodImage())
        holder.foodName.text = currentItem.getFoodName()
    }

    override fun getItemCount(): Int {
        return childModelArrayList.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}
