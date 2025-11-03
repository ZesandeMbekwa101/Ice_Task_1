package com.example.icetask_1.ui.Fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.icetask_1.Data.Model.Post
import com.example.icetask_1.Data.Network.RetrofitClient
import com.example.icetask_1.databinding.FragmentPost3Binding
import com.example.icetask_1.ui.JsonDisplayActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import com.google.gson.Gson

class PostFragment3 : Fragment() {

    private var _binding: FragmentPost3Binding? = null
    private val binding get() = _binding!!

    private var currentPost: Post? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPost3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Fetch data from API
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val post = RetrofitClient.api.getPostFiltered(userId = 1, id = 5)
                currentPost = post
                withContext(Dispatchers.Main) {
                    binding.textUserId.text = post.userId.toString()
                    binding.textPostId.text = post.id.toString()
                    binding.textTitle.text = post.title
                    binding.textBody.text = post.body
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Log.e("RetrofitError", "Exception: ", e)
                    binding.textBody.text = "Failed: ${e.message}"
                }
            }
        }

        // Button click to generate JSON and open JsonDisplayActivity
        binding.btnGenerateJson.setOnClickListener {
            currentPost?.let { post ->
                val jsonString = Gson().toJson(post)
                val intent = Intent(requireContext(), JsonDisplayActivity::class.java)
                intent.putExtra("json_data", jsonString)
                startActivity(intent)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
