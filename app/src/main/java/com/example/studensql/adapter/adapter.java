package com.example.studensql.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.studensql.R;

import java.util.List;

public class adapter extends ArrayAdapter {
    Context context;
    int resource;
    List<com.example.sqlite.model.Student> list;

    public adapter(@NonNull Context context, int resource, @NonNull List<com.example.sqlite.model.Student> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.list=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.textName=convertView.findViewById(R.id.text_name);
            viewHolder.textDate=convertView.findViewById(R.id.text_date);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        com.example.sqlite.model.Student student=list.get(position);
        viewHolder.textName.setText(student.getMSSV()+". "+ student.getName());
        viewHolder.textDate.setText(student.getDateOfBirth());
        return convertView;
    }
    public class ViewHolder{
        private TextView textName;
        private TextView textDate;
    }
}
