package com.example.editprofileactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.editprofileactivity.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    // 1. Khai báo biến ViewBinding cho DetailActivity
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Giữ nguyên tính năng tràn viền

        // 2. Khởi tạo ViewBinding thay cho R.layout.activity_detail
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 3. Sử dụng binding.main cho Edge-to-Edge
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ... (Giữ nguyên các đoạn code setOnApplyWindowInsetsListener ở trên)

// 1. Nhận toàn bộ dữ liệu truyền sang
        val receivedName = intent.getStringExtra("USER_NAME") ?: "Chưa cập nhật"
        val receivedId = intent.getStringExtra("STUDENT_ID") ?: "Chưa cập nhật"
        val receivedClass = intent.getStringExtra("CLASS_NAME") ?: "Chưa cập nhật"

// 2. Trình bày dữ liệu lên màn hình chi tiết
        binding.tvDetailName.text = "Họ và tên: $receivedName"
        binding.tvDetailId.text = "Mã sinh viên: $receivedId"
        binding.tvDetailClass.text = "Lớp học: $receivedClass"
    }
}