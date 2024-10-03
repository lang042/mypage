package com.example.mypage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MyPage extends AppCompatActivity {

    private Button setReminderButton, viewMonthlyGraphButton, aiSummaryButton, contactAdminButton, disconnectNaverButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);

        // 뷰 객체 연결
        setReminderButton = findViewById(R.id.setReminderButton);
        viewMonthlyGraphButton = findViewById(R.id.viewMonthlyGraphButton);
        aiSummaryButton = findViewById(R.id.aiSummaryButton);
        contactAdminButton = findViewById(R.id.contactAdminButton);
        disconnectNaverButton = findViewById(R.id.disconnectNaverButton);

        // 각 버튼 클릭 리스너 설정
        setReminderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 알림 설정 페이지로 이동
                Intent intent = new Intent(MyPage.this, SetReminderActivity.class);
                startActivity(intent);
            }
        });

        viewMonthlyGraphButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 월별 그래프 페이지로 이동
                Intent intent = new Intent(MyPage.this, MonthlyGraphActivity.class);
                startActivity(intent);
            }
        });

        aiSummaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // AI 한달 요약 페이지로 이동
                Intent intent = new Intent(MyPage.this, AISummaryActivity.class);
                startActivity(intent);
            }
        });

        contactAdminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 문의하기 페이지로 이동
                Intent intent = new Intent(MyPage.this, ContactAdminActivity.class);
                startActivity(intent);
            }
        });

        disconnectNaverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 네이버 로그인 연동 해제 페이지로 이동
                Intent intent = new Intent(MyPage.this, DisconnectNaverActivity.class);
                startActivity(intent);
            }
        });
    }
}
