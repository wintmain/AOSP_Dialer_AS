package com.wintmain.dialer.main.impl;

import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import com.wintmain.dialer.R;
import com.wintmain.dialer.widget.EmptyContentView;

@RequiresApi(api = Build.VERSION_CODES.Q)
public class DefaultDialerActivity extends AppCompatActivity
        implements EmptyContentView.OnEmptyViewActionButtonClickedListener {

    private final ActivityResultLauncher<Intent> mDefaultDialerLauncher =
            registerForActivityResult(
                    new ActivityResultContracts.StartActivityForResult(),
                    result -> {
                        if (result.getResultCode() == RESULT_OK) {
                            finish();
                        }
                    });
    private RoleManager mRoleManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.MainActivityTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_dialer_view);

        mRoleManager = (RoleManager) getSystemService(Context.ROLE_SERVICE);

        EmptyContentView emptyContentView = findViewById(R.id.empty_list_view);
        emptyContentView.setDescription(R.string.default_dialer_text);
        emptyContentView.setImage(R.drawable.quantum_ic_call_vd_theme_24);
        emptyContentView.setActionLabel(R.string.default_dialer_action);
        emptyContentView.setActionClickedListener(this);
        emptyContentView.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mRoleManager.isRoleHeld(RoleManager.ROLE_DIALER)) {
            finish();
        }
    }


    @Override
    public void onEmptyViewActionButtonClicked() {
        Intent roleRequest = mRoleManager.createRequestRoleIntent(RoleManager.ROLE_DIALER);
        roleRequest.putExtra(TelecomManager.EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME,
                getPackageName());
        mDefaultDialerLauncher.launch(roleRequest);
    }
}
