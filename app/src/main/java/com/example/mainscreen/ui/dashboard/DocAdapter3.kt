package com.example.mainscreen.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mainscreen.R
import com.example.mainscreen.databinding.DocItemBinding

class DocAdapter3: RecyclerView.Adapter<DocAdapter3.DocHolder>() {
    var docList3 = ArrayList<Doc>()

    class DocHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = DocItemBinding.bind(item)
        fun bind(doc: Doc) = with(binding) {
            im.setImageResource(doc.imageId)
            tvTitle.text = doc.title

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.doc_item, parent, false)
        return DocAdapter3.DocHolder(view)
    }

    override fun onBindViewHolder(holder: DocHolder, position: Int) {
        holder.bind(docList3[position])
    }

    override fun getItemCount(): Int {
        return docList3.size
    }
    fun addDoc(doc: Doc){
        docList3.add(doc)
        notifyDataSetChanged()
    }
}