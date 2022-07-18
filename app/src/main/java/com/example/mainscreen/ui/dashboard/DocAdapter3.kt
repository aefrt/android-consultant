package com.example.mainscreen.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.mainscreen.R
import com.example.mainscreen.databinding.DocItemBinding

interface DocDelegate3{
    fun openDoc(head : String)
}

class DocAdapter3: RecyclerView.Adapter<DocAdapter3.DocHolder>() {
    var docList3 = ArrayList<Doc>()

    //new code
    private var delegate: DocDelegate3? = null

    fun attachDelegate(delegate: DocDelegate3){
        this.delegate = delegate
    }
    //

    class DocHolder(item: View, val delegate: DocDelegate3?) : RecyclerView.ViewHolder(item) {
        val binding = DocItemBinding.bind(item)
        val description : CardView = item.findViewById(R.id.card)
        fun bind(doc: Doc) = with(binding) {
            im.setImageResource(doc.imageId)
            tvTitle.text = doc.title
            description.setOnClickListener {
                delegate?.openDoc(doc.title)
                //
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.doc_item, parent, false)
        return DocAdapter3.DocHolder(view, delegate)
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