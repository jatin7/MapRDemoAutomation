package it.skarafaz.mercury.adapter;
/*
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.afollestad.materialdialogs.MaterialDialog;
import it.skarafaz.mercury.R;
*/

import it.skarafaz.mercury.model.config.Command;

import java.util.List;

public class CommandListAdapter {

    public CommandListAdapter( List<Command> commands) {
        //super(context, R.layout.command_list_item, commands);
    }

/*
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.command_list_item, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        final Command command = getItem(position);
        holder.name.setText(command.getName());
        holder.info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getContext())
                        .title(command.getName())
                        .content(command.getCmd())
                        .show();
            }
        });
        holder.row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SshCommandRegular(command).start();
            }
        });
        return view;
    }

    static class ViewHolder {
        @BindView(R.id.row)
        RelativeLayout row;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.info)
        ImageView info;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }*/
}
