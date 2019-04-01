package com.example.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ToastMe(view: View) {
        val toast = Toast.makeText(this, R.string.Toast, Toast.LENGTH_LONG)
        toast.show()
    }

    class ExampleFragment : Fragment() {
        val ARG_TEXT = "TEXT_FOR_TEXT_VIEW_KEY"

        fun newInstance(textForTextView: String): ExampleFragment {

            val args = Bundle()
            args.putString(ARG_TEXT, textForTextView)
            val fragment = ExampleFragment()
            fragment.arguments = args

            return fragment
        }

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            val view: View = inflater.inflate(R.layout.fr_example, container, false)
            val mExampleText: TextView = view.findViewById(R.id.tv_example)
            val args: Bundle? = arguments
            val text = args?.getString(ARG_TEXT)
            mExampleText.setText(text)
            return view
        }
    }
}

