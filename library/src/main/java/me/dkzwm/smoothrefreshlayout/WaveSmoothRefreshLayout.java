package me.dkzwm.smoothrefreshlayout;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.util.AttributeSet;

import me.dkzwm.smoothrefreshlayout.extra.header.WaveHeader;

/**
 * Wave smooth refresh layout
 *
 * @author dkzwm
 */
public class WaveSmoothRefreshLayout extends SmoothRefreshLayout {
    private WaveHeader mWaveHeader;

    public WaveSmoothRefreshLayout(Context context) {
        this(context, null);
    }

    public WaveSmoothRefreshLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public WaveSmoothRefreshLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initViews(context);
    }

    private void initViews(Context context) {
        mMode = MODE_REFRESH;
        mWaveHeader = new WaveHeader(context);
        setHeaderView(mWaveHeader);
        setEnableHeaderDrawerStyle(true);
        setEnableKeepRefreshView(true);
        setCanMoveTheMaxRatioOfHeaderHeight(.2f);
        setRatioOfHeaderHeightToRefresh(.11f);
        setOffsetRatioToKeepHeaderWhileLoading(.11f);
        setDurationToCloseHeader(1000);
        setDurationOfBackToHeaderHeight(1000);
    }

    public WaveHeader getDefaultHeader() {
        return mWaveHeader;
    }

    public void setWaveHeaderBackgroudColor(@ColorInt int color) {
        mWaveHeader.setBackgroundColor(color);
    }

    public void setWaveHeaderTextColor(@ColorInt int color) {
        mWaveHeader.setTextColor(color);
    }

    public void setWaveHeaderTextSize(float size) {
        mWaveHeader.setTextSize(size);
    }

    public void setWaveHeaderProgressBarWidth(int width) {
        mWaveHeader.setProgressBarWidth(width);
    }

    public void setWaveHeaderProgressBarColor(@ColorInt int color) {
        mWaveHeader.setProgressBarColor(color);
    }

}
