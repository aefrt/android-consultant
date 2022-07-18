package com.example.mainscreen.ui.dashboard

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.mainscreen.R
import com.example.mainscreen.databinding.DocItemBinding


//new code
interface DocDelegate{
    fun openDoc(head : String)
}
//

class DocAdapter: RecyclerView.Adapter<DocAdapter.DocHolder>(){
    var docList = ArrayList<Doc>()

    //new code
    private var delegate: DocDelegate? = null

    fun attachDelegate(delegate: DocDelegate){
        this.delegate = delegate
    }
    //


    class DocHolder(item: View, val delegate: DocDelegate?): RecyclerView.ViewHolder(item){
        val binding = DocItemBinding.bind(item)

        val description : CardView = item.findViewById(R.id.card)

        fun bind(doc: Doc) = with(binding){
            im.setImageResource(doc.imageId)
            tvTitle.text = doc.title
            //new code
            description.setOnClickListener {
                delegate?.openDoc(doc.title)
                //
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.doc_item, parent, false)
        return DocHolder(view, delegate)
    }

    override fun onBindViewHolder(holder: DocHolder, position: Int) {
        holder.bind(docList[position])
    }

    override fun getItemCount(): Int {
        return docList.size
    }

    fun addDoc(doc: Doc){
        docList.add(doc)
        notifyDataSetChanged()
    }
}